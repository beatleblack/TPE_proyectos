package com.totalplay.herramientas;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class GetIP {

	InetAddress address=null;
	Properties prop;
	Logger log;
	
	public GetIP() {
		// TODO Auto-generated constructor stub
	}
    public String getLocalIP() {
		try {
			address = InetAddress.getLocalHost();
			return address.getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		}
    }
    
    public String getIpDominio(String dominio) {
    	StringBuilder strIp=null;
    	byte ip[];
    	try {
			address=InetAddress.getByName(dominio);
			ip=address.getAddress();
			strIp=new StringBuilder();
			for(int i=0;i<ip.length;i++) {
				if(i>0)
					strIp.append(".");
				strIp.append((int)ip[i] & 0xff);
			}
			return strIp.toString();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			return e.getMessage();
		} 
    }
}
