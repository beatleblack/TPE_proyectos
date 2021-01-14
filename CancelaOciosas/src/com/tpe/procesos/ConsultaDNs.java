package com.tpe.procesos;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import oracle.jdbc.OraclePreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.totalplay.conexiones.ConexionPool;


public class ConsultaDNs {

	Properties prop=null;
	Logger log=null;
	Map<String, String> mapDNsDPL=null;
	Map<String, String> mapDNsOciosas=null;
	static Connection dbConn=null;
	static OraclePreparedStatement stmt=null;
	static ResultSet rs=null;
	private String cadenaCon="";
	String queryEntrantesDPL;
	String querySalientesDPL;
	String queryOciosas;
	
	public ConsultaDNs() {
		
	}
	
	public ConsultaDNs(Properties prop) {
		this.prop=prop;
		PropertyConfigurator.configure(prop.getProperty("FILELOG"));
		log=Logger.getLogger(ConsultaDNs.class);
		cadenaCon=(prop.getProperty("DPL_DBDRIVER")+","
				+prop.getProperty("DPL_DBURL")+","
				+prop.getProperty("DPL_DBUSER")+","
				+prop.getProperty("DPL_DBPASS")+","
				+prop.getProperty("DPL_DB")+","
				+prop.getProperty("FILELOG"));
		this.queryOciosas=prop.getProperty("QUERYOCIOSAS");
	}
	
	public Map<String,String> consultaDNsDPL() {
		log.info("Iniciando consulta de lineas ociosas");
		mapDNsDPL=new HashMap<>();
		dbConn=new ConexionPool().obtenConexion(cadenaCon, 1, 3);
		try {
			stmt=(OraclePreparedStatement)dbConn.prepareStatement(querySalientesDPL);
			rs=stmt.executeQuery();
			while(rs.next()) {
				mapDNsDPL.put(rs.getString(1), rs.getString(1));
			}
			stmt=(OraclePreparedStatement)dbConn.prepareStatement(queryEntrantesDPL);
			rs=stmt.executeQuery();
			while(rs.next()) {
				mapDNsDPL.put(rs.getString(1), rs.getString(1));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				rs.close();
				dbConn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return mapDNsDPL;
	}
	
	public Map<String, String> consultaOciosas() {
		log.info("Iniciando consulta de lineas ociosas");
		mapDNsOciosas=new HashMap<>();
		dbConn=new ConexionPool().obtenConexion(cadenaCon, 1, 3);
		try {
			stmt=(OraclePreparedStatement)dbConn.prepareStatement(queryOciosas);
			rs=stmt.executeQuery();
			while(rs.next()) {
				mapDNsOciosas.put(rs.getString(1),rs.getString(1));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				rs.close();
				dbConn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return mapDNsOciosas;
	}
	
}
