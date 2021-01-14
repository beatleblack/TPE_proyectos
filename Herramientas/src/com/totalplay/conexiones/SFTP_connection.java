package com.totalplay.conexiones;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * 
 * @author svillalvas
 *
 */
public class SFTP_connection {

	Logger log=null;
	Properties prop=null;
	private JSch objJsch = null;
	private Session session = null;
	private Channel channel = null;
	
	public SFTP_connection() {
		
	}

	/**
	 * 
	 * @param prop Se recibe cadena con la ruta del archivo properties del log.
	 * 
	 */
	public SFTP_connection(String logPath) {
		PropertyConfigurator.configure(logPath);
		log=Logger.getLogger(SFTP_connection.class);
	}
	
	private Channel creaConexionSFTP(String user,String host, int port,String pass) {
		objJsch=new JSch();
		try {
			log.info("Iniciando conexion a: "+host);
			session=objJsch.getSession(user, host, port);
			session.setConfig("StrictHostKeyChecking", "no");
			session.setConfig("PreferredAuthentications","publickey,keyboard-interactive,password");
			session.setPassword(pass);
			session.connect();
			channel=session.openChannel("sftp");
			channel.connect();
			if(channel.isConnected()) {
				System.out.println("Conexion SFTP realizada al equipo: "+host);
				return channel;
			}{
				log.error("Error al crear conexion en: "+host);
				return channel;
			}
		} catch (JSchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error("Error al crear conexion: "+e.getMessage());
		}
		return channel;
	}
	public Channel getChannel(String user,String host,int port,String pass) {
		return creaConexionSFTP(user, host, port,pass);
	}
}
