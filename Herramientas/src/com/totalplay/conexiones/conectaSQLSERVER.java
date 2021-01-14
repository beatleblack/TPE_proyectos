package com.totalplay.conexiones;

import java.sql.*;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class conectaSQLSERVER {

	
	protected String strLog;
	Logger log=null;
	String  arrCadena[]=null;
	private Connection sqlServerConn=null;
	static Statement stmt=null;
	static ResultSet rs=null;
	
	public  conectaSQLSERVER() {
		// TODO Auto-generated constructor stub
	}
		
	public static void main(String args[]){
		conectaSQLSERVER obj=new conectaSQLSERVER();
		Connection conSQL= obj.obtenConexion("10.180.249.50;sistemas;S1ST3M0Sekt12345%;1433;apexDCT;E:/cfg/CDRsHuaweiLog4j.properties");
		String query="select * from apex800.dbo.dialedNumber";
		try {
			stmt=conSQL.createStatement();
			rs=stmt.executeQuery(query);
			while(rs.next()){
				System.out.println(rs.getString(1)+";"
						+rs.getString(2)+";"
						+rs.getString(3)+";"
						+rs.getString(4)+";"
						+rs.getString(5)+";"
						+rs.getString(6)+";"
						+rs.getString(7)+";"
						+rs.getString(8)+";"
						+rs.getString(9)+";"
						+rs.getString(10)+";"
						+rs.getString(11)+";"
						+rs.getString(12)+";"
						+rs.getString(13)+";"
						+rs.getString(14)+";"
						+rs.getString(15)+";"
						+rs.getString(16)+";"
						+rs.getString(17)+";"
						+rs.getString(18)+";"
						+rs.getString(19)
						);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.err.println(e.getMessage());
		}finally{
			try {
				conSQL.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public Connection obtenConexion(String cadena){
		System.out.println("Creando conexion: "+cadena);
		String dburl="jdbc:sqlserver://";
		arrCadena=cadena.split(";");
		if(arrCadena.length<6){
			System.err.println("No se recibieron los parametros esperados:\n"
					+ "URL;USER;PASS;PORT;DB;PATHLOG");
			System.exit(0);
		}
		PropertyConfigurator.configure(arrCadena[5]);
		log=Logger.getLogger(conectaSQLSERVER.class);
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			dburl+=arrCadena[0]+":"+arrCadena[3]+";databaseName="+arrCadena[4]+";user="+arrCadena[1]+";password="+arrCadena[2]+";";
			log.debug(dburl);
			sqlServerConn=DriverManager.getConnection(dburl);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			log.fatal(e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.fatal(e.getMessage());
		}
		return sqlServerConn;
	}
	
}
