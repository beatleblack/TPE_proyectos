package tpe.conexiones;

import java.util.Properties;
import java.sql.*;

public class RedshiftCon {

	Properties prop;
	private String dbUrl;
	private String user;
	private String pass;
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs=null;
	
	
	public RedshiftCon(Properties prop) {
		this.prop=prop;
		dbUrl=prop.getProperty("DBURL");
		user=prop.getProperty("DBUSER");
		
	}
	
	public void creaConexion() {
		try {
			Class.forName("com.amazon.redshift.jdbc.Driver");
			System.out.println("Conectando a la base de datos.");
			prop.setProperty("user", user);
			prop.setProperty("password", pass);
			conn=DriverManager.getConnection(dbUrl,prop);
			System.out.println("Listing system tables");
			stmt=conn.createStatement();
			rs=stmt.executeQuery(prop.getProperty("QUERY_AAA"));
			while(rs.next()) {
				System.out.print(rs.getString(1)+";");
				System.out.print(rs.getString(2)+";");
				System.out.print(rs.getString(3)+";");
				System.out.println();
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
