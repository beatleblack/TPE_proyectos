package com.tpe.ws;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Properties;

import org.apache.axis.AxisFault;
import org.tempuri.ArrResultAgilController;
import org.tempuri.TpPro2020SoapStub;

public class ConsultaConsumosAR {
	
	URL url=null;
	String fechaInicio=null;
	String fechaFin=null;
	String numeroserieAR=null;
	ArrResultAgilController arrResult=null;
	Properties prop;
	public ConsultaConsumosAR(Properties prop) {
		// TODO Auto-generated constructor stub
		this.prop=prop;
	}

	public void consulta(String fecIn,String fecFin,String serialnumber) {
		fechaInicio="2021-01-12 00:00:00";
		fechaFin="2021-01-12 23:59:59";
		numeroserieAR="2102351WGN10K1000264";
		try {
			url=new URL("http://10.213.4.17/TpUniversal/TpPro2020.asmx");
			TpPro2020SoapStub objConsulta=new TpPro2020SoapStub(url, null);
			arrResult=objConsulta.consumosAltanTpPro(fechaInicio, fechaFin, numeroserieAR);
			System.out.println("Error en respuesta del servicio." + arrResult.getResultDescription());
			if(arrResult.getOutConsumosAltan()==null) {
				System.err.println("Error en respuesta del servicio." + arrResult.getIdResult());
			}else {
				System.out.println(arrResult.getOutConsumosAltan().getGb());
				System.out.println(arrResult.getOutConsumosAltan().getMb());
			}
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
