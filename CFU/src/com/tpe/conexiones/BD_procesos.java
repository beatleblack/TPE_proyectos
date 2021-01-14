package com.tpe.conexiones;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.totalplay.conexiones.ConexionPool;
import oracle.jdbc.internal.OraclePreparedStatement;

public class BD_procesos {
	
	Properties prop;
	Logger log;
	String cadenaCon;
	Connection dbConn=null;
	OraclePreparedStatement stmt;
	ResultSet rs=null;
	
	public BD_procesos(Properties prop,String base) {
		this.prop=prop;
		PropertyConfigurator.configure(prop.getProperty("FILELOG"));
		log=Logger.getLogger(BD_procesos.class);
		cadenaCon=(prop.getProperty(base+"_DBDRIVER")+","
				+prop.getProperty(base+"_DBURL")+","
				+prop.getProperty(base+"_DBUSER")+","
				+prop.getProperty(base+"_DBPASS")+","
				+prop.getProperty(base+"_DB")+","
				+prop.getProperty("FILELOG"));
		log.info(cadenaCon);
		dbConn=new ConexionPool().obtenConexion(cadenaCon, 1, 2);
	};

	public String consultaCuenta(String dn) {
		log.debug("CONSULTANDO CUENTA");
		try {
			stmt=(OraclePreparedStatement)dbConn.prepareStatement(prop.getProperty("CONSULTA_CUENTA"));
			stmt.setString(1, dn);
			rs=stmt.executeQuery();
			while(rs.next()) {
				return rs.getString(1);
			}
			return "00";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			log.error(e.getMessage());
			return "00";
		}finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public String consultaModalidad(String dn) {
		log.debug("Consultando modalidad");
		try {
			long did=Long.parseLong(dn);
		} catch (Exception e) {
			return "FIJO";
		}
		try {
			stmt=(OraclePreparedStatement)dbConn.prepareStatement(prop.getProperty("CONSULTA_MODALIDAD"));
			stmt.setString(1, dn);
			rs=stmt.executeQuery();
			while(rs.next()) {
				if(rs.getString(1).equals("C")) {
					return "CPP";
				}else {
					return "FIJO";
				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "FIJO";
		}finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return "FIJO";
	}
	
}
