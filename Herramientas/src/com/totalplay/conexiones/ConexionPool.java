package com.totalplay.conexiones;

import java.sql.Connection;
import java.sql.SQLException;
import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.PoolDataSourceFactory;
import java.util.HashMap;
import java.util.Map;
import org.apache.log4j.*;

public class ConexionPool {
	Logger log=Logger.getLogger(ConexionPool.class);
	Map<String,String> map =new HashMap<>();
	
	private String strDBURL;
	private String strDBUsuario;
	private String strDBClave;
	private String strDBDriver;
	private String strDBName;
	private PoolDataSource psd;
	private Connection dbConn=null;

//	Properties prop=null;
	
	/**
	 * 
	 * @param bd
	 * @param cadena recibira los datos de la conexion a BD con el siguiente Layout.-- cadena[DB_DRIVER,DB_URL,DB_USER,DB_PASS,NAME_DB,PATH_LOG]
	 * 
	 * 
	 */
	
	public ConexionPool(){
		
	}
	
	 ConexionPool(String cadena){
		String cadenaCon[]=cadena.split(",");
//		prop=new Properties();
		if(cadenaCon.length<5){
			System.err.println("Error:004 No se recibieron todos los valores de entrada"
					+ "cadena[DB_DRIVER,DB_URL,DB_USER,DB_PASS,NAME_DB,PATH_LOG]");
			System.err.println(cadena);
			System.exit(0);
		}
		PropertyConfigurator.configure(cadenaCon[5]);
		this.setStrDBDriver(cadenaCon[0]);
		this.setStrDBURL(cadenaCon[1]);
		this.setStrDBUsuario(cadenaCon[2]);
		this.setStrDBClave(cadenaCon[3]);
		this.setDBName(cadenaCon[4]);
	}
	 
	 private Connection creaConexion(String cadena,int poolMin,int poolMax) {
			ConexionPool conn=new ConexionPool(cadena);
			try {
				conn.iniciaPool(poolMin, poolMin, poolMax);
				dbConn=conn.getPsd().getConnection();
				log.info("Conexión a la Base "+conn.getDBName()+" realizada.");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				log.fatal(e.getMessage());
				System.exit(0);
			}
			return dbConn;
		}
	
	private boolean iniciaPool(int intTamInicial, int intMin, int intMax) throws SQLException{
		this.psd = PoolDataSourceFactory.getPoolDataSource();
		try{
			this.psd.setConnectionFactoryClassName(strDBDriver);
			this.psd.setURL(strDBURL);
			this.psd.setUser(strDBUsuario);
			this.psd.setPassword(strDBClave);
			this.psd.setInitialPoolSize(intTamInicial);
			this.psd.setMinPoolSize(intMin);
			this.psd.setMaxPoolSize(intMax);
		}catch(SQLException e){
			log.fatal(e.getMessage());
			System.exit(0);
		}
		return true;
	}
	
	public Connection obtenConexion(String cadena,int poolMin,int poolMax) {
		return creaConexion(cadena, poolMin, poolMax);
	}

	public void setStrDBURL(String strDBURL) {
		this.strDBURL = strDBURL;
	}
	
	public String getDBName() {
		return strDBName;
	}

	public void setStrDBUsuario(String strDBUsuario) {
		this.strDBUsuario = strDBUsuario;
	}

	public void setStrDBClave(String strDBClave) {
		this.strDBClave = strDBClave;
	}

	public void setStrDBDriver(String strDBDriver) {
		this.strDBDriver = strDBDriver;
	}
	
	public void setDBName(String strDBName) {
		this.strDBName=strDBName;
	}
	
	public PoolDataSource getPsd(){
		return this.psd;
	}
	
	public int getPsdAvConnCount(){
		try {
			return this.psd.getAvailableConnectionsCount();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Prueba");
		}
		return 0;
	}
	
	public long getConnActive(){
		try {
			return this.psd.getAvailableConnectionsCount();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
	
	public String getDatabaseName(){
		return this.psd.getDatabaseName();
	}
}
