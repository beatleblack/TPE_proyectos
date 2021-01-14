package com.totalplay.conexiones;

import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

/**
 * 
 * @author svillalvas
 * Clase encargada de crear el objeto con la session ssh necesaria.
 *
 */
public class SSHConector {

	Properties prop=null;
	Logger log=null;
	private Session session;
	JSch jsch=null;
	
	public SSHConector() {
		
	}
	/**
	 * 
	 * @param prop, objeto con todos los datos del properties, se requieren las llaves [FILELOG,USER_SSH,HOST_SSH,PORT_SSH,PASS_SSH]
	 * En este constructor se inicializa el properties y el objeto para trabajar el log
	 */
	public SSHConector(Properties prop) {
		this.prop=prop;
		PropertyConfigurator.configure(prop.getProperty("FILELOG"));
		log=Logger.getLogger(SSHConector.class);
	}
	
	/**
	 * 
	 * @return session, objeto con la coneccion ssh
	 */
	public Session connect() {
		if(this.session==null || !this.session.isConnected()) {
			jsch=new JSch();
			try {
				this.session=jsch.getSession(prop.getProperty("USER_SSH")
											+prop.getProperty("HOST_SSH")
											+prop.getProperty("PORT_SSH"));
				this.session.setPassword(prop.getProperty("PASS_SSH"));
				this.session.setConfig("StrictHostKeyChecking","no");
				this.session.connect();
			} catch (JSchException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return session;
	}
}
