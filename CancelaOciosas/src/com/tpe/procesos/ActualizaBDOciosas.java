package com.tpe.procesos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.totalplay.conexiones.ConexionPool;
import com.tpe.consumeWS.DatosDNs;

import oracle.jdbc.OraclePreparedStatement;

public class ActualizaBDOciosas {

	Properties prop=null;
	Logger log=null;
	String cadenaCon=null;
	String insertOciosas=null;
	static Connection dbConn=null;
	static OraclePreparedStatement stmt=null;
	static ResultSet rs=null;
	
	public ActualizaBDOciosas() {
		
	}
	
	public ActualizaBDOciosas(Properties prop) {
		this.prop=prop;
		PropertyConfigurator.configure(prop.getProperty("FILELOG"));
		log=Logger.getLogger(ActualizaBDOciosas.class);
		cadenaCon=(prop.getProperty("DPL_DBDRIVER")+","
				+prop.getProperty("DPL_DBURL")+","
				+prop.getProperty("DPL_DBUSER")+","
				+prop.getProperty("DPL_DBPASS")+","
				+prop.getProperty("DPL_DB")+","
				+prop.getProperty("FILELOG"));
		this.insertOciosas=prop.getProperty("QUERY_INSERTOCIOSAS");
		dbConn=new ConexionPool().obtenConexion(cadenaCon, 1, 2);
	}

	public void insertaDatos(DatosDNs objDN) {
		try {
			stmt=(OraclePreparedStatement)dbConn.prepareStatement(insertOciosas);
			stmt.setString(1, objDN.getDn());
			stmt.setString(2,objDN.getCuenta());
			stmt.setString(3, objDN.getTipo());
			stmt.setInt(4, 2);
			stmt.executeUpdate();
			log.info("DN cancelado Correctamente: ["+objDN.getDn()+":"+objDN.getCuenta()+":"+objDN.getNumeroSerie()+":"+objDN.getTipo()+"].");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			log.error("Error al insertar estatus:"+e.getMessage()+" ["+objDN.getDn()+":"+objDN.getCuenta()+":"+objDN.getNumeroSerie()+":"+objDN.getTipo()+"].");
		}finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
