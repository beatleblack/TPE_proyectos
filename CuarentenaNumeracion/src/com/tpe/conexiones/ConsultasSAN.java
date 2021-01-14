package com.tpe.conexiones;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.totalplay.conexiones.ConexionPool;

import oracle.jdbc.internal.OraclePreparedStatement;

public class ConsultasSAN {

	Properties prop;
	Logger log;
	String cadenaCon;
	Connection dbConn=null;
	OraclePreparedStatement stmt;
	ResultSet rs=null;
	Map<Long,Integer> mapCuarentena;
	
	public ConsultasSAN(Properties prop) {
		this.prop=prop;
		PropertyConfigurator.configure(prop.getProperty("FILELOG"));
		log=Logger.getLogger(ConsultasSAN.class);
		cadenaCon=(prop.getProperty("SAN_DBDRIVER")+","
				+prop.getProperty("SAN_DBURL")+","
				+prop.getProperty("SAN_DBUSER")+","
				+prop.getProperty("SAN_DBPASS")+","
				+prop.getProperty("SAN_DB")+","
				+prop.getProperty("FILELOG"));
		log.debug(cadenaCon);
		dbConn=new ConexionPool().obtenConexion(cadenaCon, 1, 2);
	}
	
	public Map<Long,Integer> consultaDNs() {
		log.debug("Consultando DNs cuarentena");
		mapCuarentena=new HashMap<Long, Integer>();
		try {
			stmt=(OraclePreparedStatement)dbConn.prepareStatement(prop.getProperty("CONSULTA_CUARENTENA"));
			rs=stmt.executeQuery();
			while(rs.next()) {
				mapCuarentena.put(rs.getLong(1), Integer.parseInt(rs.getString(2)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			log.error(e.getMessage());
		}finally {
			try {
				rs.close();
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return mapCuarentena;
	}
	
	public void updateNumeros(long dn) {
		log.debug("Actualizando TANUMEROS");
		try {
			stmt=(OraclePreparedStatement)dbConn.prepareStatement(prop.getProperty("UPDATE_TANUMEROS"));
			stmt.setLong(1, dn);
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void updateCuarentena(long dn) {
		log.debug("Actualizando TACUARENTENA");
		try {
			stmt=(OraclePreparedStatement)dbConn.prepareStatement(prop.getProperty("UPDATE_TACUARENTENA"));
			stmt.setLong(1, dn);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void updateCuarentenaError(long dn) {
		log.debug("Actualizando TACUARENTENA");
		try {
			stmt=(OraclePreparedStatement)dbConn.prepareStatement(prop.getProperty("UPDATE_TACUARENTENA_ERROR"));
			stmt.setLong(1, dn);
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public int consultaEstatusNumero(long dn) {
		log.debug("Consultando estatus DN TA_NUMEROS");
		try {
			stmt=(OraclePreparedStatement)dbConn.prepareStatement(prop.getProperty("CONSULTA_ESTATUS_DN"));
			stmt.setLong(1, dn);
			rs=stmt.executeQuery();
			while(rs.next()) {
				try {
					rs.close();
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return rs.getInt(1);
			}
			return -1;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			return -2;
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
}
