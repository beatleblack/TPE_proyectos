package tpe.procesos.conexiones;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.totalplay.conexiones.ConexionPool;
import oracle.jdbc.internal.OraclePreparedStatement;
import tpe.procesos.entidades.CONSULTA_B4C;

public class BD {

	Properties prop=null;
	Logger log=null;
	String cadenaCon=null;
	Connection dbConn=null;
	OraclePreparedStatement stmt=null;
	ResultSet rs=null;
	CONSULTA_B4C b4c;
	ArrayList<CONSULTA_B4C> arrB4C;
	Map<Integer, CONSULTA_B4C> mapB4C;
	
	public BD(Properties prop) {
		this.prop=prop;
		PropertyConfigurator.configure(prop.getProperty("FILELOG"));
		log=Logger.getLogger(BD.class);
		cadenaCon=(prop.getProperty("DPL_DBDRIVER")+","
				+prop.getProperty("DPL_DBURL")+","
				+prop.getProperty("DPL_DBUSER")+","
				+prop.getProperty("DPL_DBPASS")+","
				+prop.getProperty("DPL_DB")+","
				+prop.getProperty("FILELOG"));
		dbConn=new ConexionPool().obtenConexion(cadenaCon, 1, 2);
		
	}
	
	public ArrayList<CONSULTA_B4C> consultaB4C() {
		arrB4C=new ArrayList<CONSULTA_B4C>();
		try {
			stmt=(OraclePreparedStatement)dbConn.prepareStatement(prop.getProperty("CONSULTA_FACTURAS"));
			log.debug(prop.getProperty("CONSULTA_FACTURAS"));
			rs=stmt.executeQuery();
			while(rs.next()) {
				log.debug(rs.getString(1)+";"+rs.getString(2)+";"+rs.getString(2)+";"+rs.getString(4)+";"+rs.getString(5)+";"+rs.getString(6)+";"+
						rs.getString(7)+";"+rs.getString(8)+";"+rs.getString(9)+";"+rs.getString(10)+";"+rs.getString(11)+";"+rs.getString(12)+";"+
						rs.getString(13)+";"+rs.getString(14)+";"+rs.getString(15)+";"+rs.getString(16)+";"+rs.getString(17));
				b4c=new CONSULTA_B4C();
				b4c.setID_FACTURA(rs.getString(1));
				b4c.setFOLIO(rs.getString(2));
				b4c.setCFDI_UUID(rs.getString(3));
				b4c.setFECHA_FACTURA_FISCAL(rs.getString(4));
				b4c.setFOLIO_POLIZA(rs.getString(5));
				b4c.setFECHA_POLIZA(rs.getString(6));
				b4c.setIMPORTE(rs.getString(7));
				b4c.setIMPUESTOS(rs.getString(8));
				b4c.setTOTAL(rs.getString(9));
				b4c.setID_DOCUMENTO(rs.getString(10));
				b4c.setID_OPERADOR(rs.getString(11));
				b4c.setOPERADOR(rs.getString(12));
				b4c.setCLAVE_REFERENCIA(rs.getString(13));
				b4c.setRFC(rs.getString(14));
				b4c.setMONEDA(rs.getString(15));
				b4c.setCLASIFFISCAL(rs.getString(16));
				b4c.setTIPOCOMPROBANTE(rs.getString(17));
				b4c.setEJERCICIOFISCAL(rs.getString(18));
				arrB4C.add(b4c);
			}
			return arrB4C;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
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
	
	public Map<Integer, CONSULTA_B4C> consultaProcesados() {
		mapB4C=new HashMap<Integer, CONSULTA_B4C>();
		try {
			stmt=(OraclePreparedStatement)dbConn.prepareStatement(prop.getProperty("CONSULTA_PROCESADOS"));
			while(rs.next()) {
				b4c=new CONSULTA_B4C();
				b4c.setID_FACTURA(rs.getString(1));
				b4c.setFOLIO(rs.getString(2));
				b4c.setFECHA_FACTURA_FISCAL(rs.getString(3));
				b4c.setFOLIO_POLIZA(rs.getString(4));
				b4c.setIMPORTE(rs.getString(5));
				b4c.setIMPUESTOS(rs.getString(6));
				b4c.setTOTAL(rs.getString(7));
				b4c.setID_DOCUMENTO(rs.getString(8));
				b4c.setID_OPERADOR(rs.getString(9));
				b4c.setOPERADOR(rs.getString(10));
				b4c.setCLAVE_REFERENCIA(rs.getString(11));
				b4c.setRFC(rs.getString(12));
				b4c.setRESPONSE_SAP(rs.getString(13));
				b4c.setFECHA_PROCESO(rs.getString(14));
				b4c.setESTATUS(rs.getString(15));
				mapB4C.put(Integer.parseInt(b4c.getID_FACTURA()), b4c);
			}
			return mapB4C;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
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
	
	public boolean consultaProcesados(int id) {
		log.debug("Consultando Procesado: "+id);
		mapB4C=new HashMap<Integer, CONSULTA_B4C>();
		try {
			stmt=(OraclePreparedStatement)dbConn.prepareStatement(prop.getProperty("CONSULTA_PROCESADOS"));
			stmt.setInt(1, id);
			rs=stmt.executeQuery();
			while(rs.next()) {
				if(rs.getInt(1)==0) {
					return true;
				}else {
					return false;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return true;
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
	
	public void insertProcesados(CONSULTA_B4C datos) {
		log.info("Insertando registro");
		try {
			stmt=(OraclePreparedStatement)dbConn.prepareStatement(prop.getProperty("INSERT_PROCESADOS"));
			stmt.setInt(1, Integer.parseInt(datos.getID_FACTURA()));
			stmt.setString(2, datos.getFOLIO());
			stmt.setString(3, datos.getFECHA_FACTURA_FISCAL());
			stmt.setString(4, datos.getFOLIO_POLIZA());
			stmt.setString(5, datos.getIMPORTE());
			stmt.setString(6, datos.getIMPUESTOS());
			stmt.setString(7, datos.getTOTAL());
			stmt.setString(8, datos.getID_DOCUMENTO());
			stmt.setString(9, datos.getID_OPERADOR());
			stmt.setString(10, datos.getOPERADOR());
			stmt.setString(11, datos.getCLAVE_REFERENCIA());
			stmt.setString(12, datos.getRFC());
			stmt.setString(13, datos.getRESPONSE_SAP());
			stmt.setInt(14, 1);
			stmt.setString(15, datos.getCFDI_UUID());
			log.debug(stmt.getOriginalSql());
			log.debug(Integer.parseInt(datos.getID_FACTURA()));			
			log.debug(datos.getFOLIO());
			log.debug(datos.getFECHA_FACTURA_FISCAL());
			log.debug(datos.getFOLIO_POLIZA());
			log.debug(Float.parseFloat(datos.getIMPORTE()));
			log.debug(Float.parseFloat(datos.getIMPUESTOS()));
			log.debug(Float.parseFloat(datos.getTOTAL()));
			log.debug(Integer.parseInt(datos.getID_DOCUMENTO()));
			log.debug(Integer.parseInt(datos.getID_OPERADOR()));
			log.debug( datos.getOPERADOR());
			log.debug( datos.getCLAVE_REFERENCIA());
			log.debug( datos.getRFC());
			log.debug( datos.getRESPONSE_SAP());
			log.debug( 1);
			stmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			log.error(e.getMessage());
//			e.printStackTrace();
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
