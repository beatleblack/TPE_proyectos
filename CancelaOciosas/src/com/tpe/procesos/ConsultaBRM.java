package com.tpe.procesos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.totalplay.conexiones.ConexionPool;

import oracle.jdbc.OraclePreparedStatement;

public class ConsultaBRM {

	Properties prop=null;
	String cuenta;
	String tipo;
	String estatus;
	String cadenaCon="";
	static Connection dbConn=null;
	static OraclePreparedStatement stmt=null;
	static ResultSet rs=null;
	Logger log=null;
	Map<String, ConsultaBRM> mapDNsBRM=null;
	String queryBRM="select a.account_no, " + 
			"      s.login, " + 
			"    decode(substr(s.poid_type,10,3),'tot', 'TP', 'enl', 'ENL', 'tfe', 'TFE') ,\r\n" + 
			"    s.status\r\n" + 
			"from brmapp01.account_t a, brmapp01.service_t s \r\n" + 
			"where a.poid_id0 = s.account_obj_id0 \r\n" + 
			"and s.poid_type like '/service/%/telephony' \r\n" + 
			"and s.status!=10103\r\n" + 
			"and trunc(brmapp01.unix2ora_Date(a.created_t)) <= trunc(ADD_MONTHS(sysdate,-6))";
	
	public ConsultaBRM() {
		
	}
	
	public ConsultaBRM(Properties prop) {
		System.out.println("Iniciando constructor ConsultaBRM");
		this.prop=prop;
		PropertyConfigurator.configure(prop.getProperty("FILELOG"));
		log=Logger.getLogger(ConsultaBRM.class);
		cadenaCon=(prop.getProperty("BRM_DBDRIVER")+","
				+prop.getProperty("BRM_DBURL")+","
				+prop.getProperty("BRM_DBUSER")+","
				+prop.getProperty("BRM_DBPASS")+","
				+prop.getProperty("BRM_DB")+","
				+prop.getProperty("FILELOG"));
	}
	
/**
 * Constructor para dar valor al objeto para cliente
 * @param cuenta
 * @param tipo
 * @param estatus
 */
	public ConsultaBRM(String cuenta,String tipo, String estatus) {
		this.cuenta=cuenta;
		this.tipo=tipo;
		this.estatus=estatus;
	}
	
	
	public Map<String, ConsultaBRM> obtenClientesBRM() {
		log.info("Iniciando obtencion de clientes");
		mapDNsBRM=new HashMap<>();
		dbConn=new ConexionPool().obtenConexion(cadenaCon, 1, 2); 
		try {
			stmt=(OraclePreparedStatement)dbConn.prepareStatement(queryBRM);
			rs=stmt.executeQuery();
			log.info("Ejecutando consulta.");
			while(rs.next()) {
				mapDNsBRM.put(rs.getString(2), new ConsultaBRM(rs.getString(1), rs.getString(3), rs.getString(4)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mapDNsBRM;
	}
	

}
