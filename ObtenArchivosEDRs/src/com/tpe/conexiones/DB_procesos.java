package com.tpe.conexiones;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.totalplay.conexiones.ConexionPool;
import com.tpe.procesos.entidades.ARCHIVO;

import oracle.jdbc.internal.OraclePreparedStatement;


public class DB_procesos {

	Properties prop;
	Logger log;
	String cadenaCon=null;
	Connection dbConn=null;
	OraclePreparedStatement stmt;
	ResultSet rs=null;
	
	public DB_procesos(Properties prop) {
		this.prop=prop;
		PropertyConfigurator.configure(prop.getProperty("FILELOG"));
		log=Logger.getLogger(DB_procesos.class);
		cadenaCon=(prop.getProperty("DPL_DBDRIVER")+","
				+prop.getProperty("DPL_DBURL")+","
				+prop.getProperty("DPL_DBUSER")+","
				+prop.getProperty("DPL_DBPASS")+","
				+prop.getProperty("DPL_DB")+","
				+prop.getProperty("FILELOG"));
		dbConn=new ConexionPool().obtenConexion(cadenaCon, 1, 2);
	};
	
	protected boolean consultaArchivo(String strFile) {
		log.debug("Consultando archivo: "+strFile);
		try {
			stmt=(OraclePreparedStatement)dbConn.prepareStatement(prop.getProperty("SELECT_FILE"));
			stmt.setString(1, strFile);
			rs=stmt.executeQuery();
			while(rs.next()) {
				if(rs.getInt(1)==1) {
					return true;
				}else {
					return false;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		return false;
	}
	
	protected boolean insertaArchivo(ARCHIVO fl) {
		log.debug("Insertando archivos descargados: "+fl.getFl().getName());
		try {
			stmt=(OraclePreparedStatement)dbConn.prepareStatement(prop.getProperty("INSERT_ARCHIVO"));
			stmt.setString(1, fl.getFl().getName());
			stmt.setInt(2, fl.getIdEstatus());
			stmt.setInt(3, fl.getIdFlujo());
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			log.error("Error al insertar archivo: "+e.getMessage());
			return false;
		}finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return true;
	}
	
	public boolean actualizaRegistro(ARCHIVO archivo) {
		log.debug("Actualizando registro: "+archivo.getFl().getName());
		log.debug("Valores: "+archivo.getIdEstatus());
		try {
			stmt=(OraclePreparedStatement)dbConn.prepareStatement(prop.getProperty("UPDATE_REGISTRO"));
			stmt.setInt(1, archivo.getIdEstatus());
			stmt.setString(2, archivo.getFl().getName());
			stmt.executeUpdate();
			return true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
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
