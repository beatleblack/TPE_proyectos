package mx.com.tp.csr.main;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import mx.com.tp.csr.util.SignalFile;

public class CentralStationReceiver {
	private static final Logger log = LoggerFactory.getLogger(CentralStationReceiver.class);

	private ServerSocket server;

	final static AtomicLong counter = new AtomicLong(0);
	final static SimpleDateFormat sdf =new SimpleDateFormat("yyyyMMddHHmmss");
	final static String date = sdf.format(new Date());	


	public static final String formatDate ="HH:mm:ss,MM-dd-yyyy";
	public static final SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatDate);

	/**
	 * Streams del socket aceptado
	 */
	Socket client =null;
	private  InputStream is = null;
	private OutputStream os = null;
	private long timeIni =0;

	public CentralStationReceiver(String ipAddress,int ipPort) throws Exception {
		if (ipAddress != null && !ipAddress.isEmpty()) 
			this.server = new ServerSocket(ipPort, 1, InetAddress.getByName(ipAddress));
		else 
			this.server = new ServerSocket(ipPort, 1, InetAddress.getLocalHost());
	}




	/**
	 * Escucha peticiones 
	 */
	private void listen()
	{
		while (true)
		{
			client =null;
			String sourceIp=null;
			int sourcePort=0;

			try {
				client = this.server.accept();
				/*Tiempo inicial de la operacion*/
				timeIni =System.currentTimeMillis();
				sourceIp=client.getInetAddress().getHostAddress();
				sourcePort=client.getPort();
			} catch (IOException e) {				
				log.error("Error al aceptar conexion:" +e,e);
				continue;
			}

			log.info("-----------------------------------");
			log.info("Mensaje recibido de la IP " +sourceIp +" del puerto "+ sourcePort +" ...");


			String dateEvent=null;
			try {
				/*Registra la hora de recepcion del mensaje*/

				dateEvent = simpleDateFormat.format(new Date());
				is = client.getInputStream();
				os = client.getOutputStream();

			} catch (IOException e) {
				log.error("Error al obtener Streams:" +e,e);				
				cerrarFlujos();
				continue;
			}

			/*Lee un maximo de 1024 bytes*/
			byte[] buffTmp = new byte[1024];
			byte[] buff =null;
			String encodedString = null;
			int bytesReaded=0;
			try {
				bytesReaded = is.read(buffTmp);				
			} catch (IOException e) {
				log.error("Error al leer datos:" +e,e);
				cerrarFlujos();
				continue;
			}

			/*Copia a un nuevo arreglo los bytes leidos del socket*/
			try {

				buff = new byte[bytesReaded]; 
				System.arraycopy(buffTmp, 0, buff, 0, bytesReaded);
				encodedString = encodeHexString(buff);
			} catch (Exception e) {
				log.error("Error al copiar datos al buffer:" +e,e);
				cerrarFlujos();
				continue;
			}
			if (bytesReaded < 5)
			{
				log.error("Mensaje invalido, longitud menor a 5:" + encodedString);
				cerrarFlujos();
				continue;
			}

			log.info( "Bytes recibidos: " + encodedString);	


			String ascciString = null;
			String ascciOriginal = null;
			try {
				ascciOriginal = new String(buff, "UTF-8");
				buff[1]=0x0A;//se coloca porque el crc no es ascii
				buff[2]=0x0A;//se coloca porque el crc no es ascii
				ascciString = new String(buff, "UTF-8");
				log.info("Mensaje convertido a ascii:" + ascciString);
			} catch (UnsupportedEncodingException e1) {
				log.error("El mensaje no pudo ser convertido a ascii:" +e1,e1);
				cerrarFlujos();
				continue;
			}

			if (ascciOriginal.contains("GET"))
			{
				log.info("Peticion GET recibida...");
				/*enviaa el acuse de positivo*/
				try {
					os.write("HTTP/1.1 200 OK\r\nContent-Length: 4\r\n\r\npong".getBytes("UTF-8"));
				} catch (IOException e) {
					log.error("Error al enviar acuse:" +e,e);
					/*Sigue le flujo para enviar la alerta a DPL*/
				}
				finally{
					log.info("Regreso pong y continua escuhando.");
					cerrarFlujos();
					
				}
				
				continue;
			}

			log.info("Parseado mensaje:");
			String id =null;
			String seq = null;
			String lPrefix =null;
			String account = null;
			String data = null;
			String siaEventId = null;
			String siaAreaId =  null;
			String siaZone =  null;
			String timeStamp=null;
			try{
				if(buff[0]==0x0A)
				{
					log.info("LF presente");
				}
				else
				{
					log.error("LF ausente, mensaje invalido");
					cerrarFlujos();
				}

				int beginIndex=3;
				int endIndex=beginIndex+4; //4 caracteres ascci de longitud de mensaje
				String exLen = ascciString.substring(beginIndex, endIndex);

				beginIndex=endIndex +1; //Mas 1 caracter comillas(") del ID
				int decimalLen=Integer.parseInt(exLen,16); 
				String mensaje = ascciString.substring(beginIndex);

				log.info("Longitud del mensaje:" + decimalLen);
				log.debug("Longitud real del mensaje:" + mensaje.length() );
				if (mensaje.length() < decimalLen)
				{
					log.error("Longitud de mensaje incorrecta");
					cerrarFlujos();
				}
				else
				{
					log.debug("Longitud de mensaje valida");
				}


				endIndex =ascciString.indexOf("\"", beginIndex);
				id = ascciString.substring(beginIndex, endIndex);
				beginIndex=endIndex+1;//Del caracter " que cierra el id
				endIndex=beginIndex+4;//4 caracteres ascci de secuencia
				log.info("id:" + id);

				seq = ascciString.substring(beginIndex, endIndex);
				log.info("secuencia:" + seq);


				beginIndex=endIndex;//Del caracter " que cierra el id
				endIndex=beginIndex+2;//2 caracteres en caso de que Lprefix sea L0			
				lPrefix=ascciString.substring(beginIndex, endIndex);
				log.info("lPrefix:" + lPrefix);

				beginIndex=endIndex+1;//El caracer # que inicia el account
				endIndex =ascciString.indexOf("[", beginIndex);
				account=ascciString.substring(beginIndex, endIndex);
				log.info("account:" + account);


				beginIndex=endIndex+1;//;Mas uno por el caracer [ que inicia la seccion Data
				endIndex =ascciString.indexOf("]", beginIndex);
				data=ascciString.substring(beginIndex, endIndex);
				log.info("data:" + data);


				if (id.equals("ADM-CID"))
				{
					/*Parsear el data de acuerdo a Message Type ADM-CID (Ademco Contact)
				data:56019|1400 01 004
				[#aaaaaa|QXYZsGGsCCC]
				aaaaaa The communicator’s account number
				Q Qualifier, 1=New event or opening, 3=New restore or closing, 6=Previous event
				XYZ Class code and event code
				s One space
				GG Group number
				CCC Zone codes or user ID
					 */
					String regex="\\|";
					String result[] =data.split(regex);		
					String siaAccount=result[0];
					regex="\\s+";
					String result2[]=result[1].split(regex);
					siaEventId =result2[0];
					siaAreaId =result2[1];
					siaZone =result2[2];

					log.info("siaAccount:"+siaAccount);
					log.info("siaEvent:"+siaEventId);
					log.info("siaArea:"+siaAreaId);
					log.info("siaZone:"+siaZone);

				}
				else
				{
					log.error("El mensaje no es de tipo ADM-CID");
					cerrarFlujos();
					continue;
				}
				beginIndex=endIndex+1+1;//;Mas uno por el caracer ] que cierra el data +1 del guion bajo del timestamp
				endIndex=ascciString.length()-1;
				timeStamp=ascciString.substring(beginIndex, endIndex);
				log.info("timeStamp:" +timeStamp);

				if(buff[buff.length-1]==0x0D)
				{
					log.info("CR presente");
				}
				else
					log.info("CR ausente");
			}
			catch(Exception e)
			{
				log.error("Error al parsear mensaje:"+e,e);
				cerrarFlujos();
				continue;
			}

			/*Contruccion de acuse positivo*/
			//<LF><CRC><0LLL><"ACK"><seq><Rrcvr><Lpref><#acct>[]<CR>
			byte outBuffer[]=null;
			try{
				StringBuffer sBContenido = new StringBuffer();
				sBContenido.append("\"ACK\"");
				sBContenido.append(seq);
				sBContenido.append(lPrefix);
				sBContenido.append("#").append(account);			
				sBContenido.append("[]");//empty data
				int longitudMensaje=sBContenido.length();

				/*Longitud del contenido del acuse*/
				String hexLen =Integer.toHexString(longitudMensaje);
				while (hexLen.length()<4)
					hexLen="0"+hexLen;

				log.debug("hexLen del acuse:" + hexLen);
				byte []bCRC= calculateCRC(sBContenido.toString());
				String sCRC = new String(bCRC, StandardCharsets.UTF_8);
				log.debug("CRC hexadecimal:" + encodeHexString(bCRC));
				log.debug("sCRC:" + sCRC);


				StringBuffer sB= new StringBuffer();
				sB.append(hexLen);//Longitud
				sB.append(sBContenido);
				sB.append("\r");

				byte [] bHeader =concatByteArrays("\n".getBytes(),bCRC);
				outBuffer = concatByteArrays(bHeader,sB.toString().getBytes());


				log.info("Acuse ascci:" +sB.toString());			
				log.info("Acuse hexadecimal:"+ encodeHexString(outBuffer));
			}
			catch (Exception e)
			{
				log.error("Error al crear acuse:" +e ,e);
				cerrarFlujos();
				continue;
			}

			/*enviaa el acuse de positivo*/
			try {
				os.write(outBuffer);
			} catch (IOException e) {
				log.error("Error al enviar acuse:" +e,e);
				/*Sigue le flujo para enviar la alerta a DPL*/
			}

			/*Envia el mensaje a archivo para ser procesado por DPL*/
			StringBuffer strBuffer = new StringBuffer();
			strBuffer.append(id).append("|");
			strBuffer.append(seq).append("|");
			strBuffer.append(account).append("|");
			strBuffer.append(timeStamp).append("|");
			strBuffer.append(siaAreaId).append("|");
			strBuffer.append(siaEventId).append("|");
			strBuffer.append(siaZone).append("|");
			strBuffer.append("ND").append("|");			
			strBuffer.append(dateEvent).append("|");
			long l = counter.getAndIncrement(); 
			String recordId = date + "_"+ counter;
			strBuffer.append(recordId);
			try {
				SignalFile.createFile(strBuffer.toString(),recordId);
			} catch (IOException e) {
				log.error("Error al crear archivo de DPL:"+e,e);
			}
			finally
			{
				cerrarFlujos();
			}
		}

	}

	public void cerrarFlujos()
	{
		/*Cerrar inputStream*/
		try {
			if (is!=null)
				is.close();
		} catch (IOException e) {
			log.error ("Error el cerrar inputStream:" +e ,e);
		}

		/*Cerrar OutputStream*/
		try {
			if(os!=null)
				os.close();
		} catch (IOException e) {
			log.error ("Error el cerrar outStream:" +e ,e);
		}

		try {
			client.close();
		} catch (IOException e) {
			log.error ("Error el cerrar socket:" +e ,e);
		}


		long totaltime = System.currentTimeMillis() - timeIni ;
		log.info("totaltime:"+totaltime);
		log.info("------------------------------------");
	}


	public InetAddress getSocketAddress() {
		return this.server.getInetAddress();
	}

	public int getPort() {
		return this.server.getLocalPort();
	}

	public String byteToHex(byte num) {
		char[] hexDigits = new char[2];
		hexDigits[0] = Character.forDigit((num >> 4) & 0xF, 16);
		hexDigits[1] = Character.forDigit((num & 0xF), 16);
		return new String(hexDigits);
	}

	public String encodeHexString(byte[] byteArray) 
	{
		StringBuffer hexStringBuffer = new StringBuffer();
		for (int i = 0; i < byteArray.length; i++) {
			hexStringBuffer.append(byteToHex(byteArray[i]));
		}
		return hexStringBuffer.toString();
	}

	/**
	 * Calcula el CRC de un string dado
	 * @param cadena
	 */
	public  byte[] calculateCRC(String cadena ) { 

		int[] table = {
				0x0000, 0xC0C1, 0xC181, 0x0140, 0xC301, 0x03C0, 0x0280, 0xC241,
				0xC601, 0x06C0, 0x0780, 0xC741, 0x0500, 0xC5C1, 0xC481, 0x0440,
				0xCC01, 0x0CC0, 0x0D80, 0xCD41, 0x0F00, 0xCFC1, 0xCE81, 0x0E40,
				0x0A00, 0xCAC1, 0xCB81, 0x0B40, 0xC901, 0x09C0, 0x0880, 0xC841,
				0xD801, 0x18C0, 0x1980, 0xD941, 0x1B00, 0xDBC1, 0xDA81, 0x1A40,
				0x1E00, 0xDEC1, 0xDF81, 0x1F40, 0xDD01, 0x1DC0, 0x1C80, 0xDC41,
				0x1400, 0xD4C1, 0xD581, 0x1540, 0xD701, 0x17C0, 0x1680, 0xD641,
				0xD201, 0x12C0, 0x1380, 0xD341, 0x1100, 0xD1C1, 0xD081, 0x1040,
				0xF001, 0x30C0, 0x3180, 0xF141, 0x3300, 0xF3C1, 0xF281, 0x3240,
				0x3600, 0xF6C1, 0xF781, 0x3740, 0xF501, 0x35C0, 0x3480, 0xF441,
				0x3C00, 0xFCC1, 0xFD81, 0x3D40, 0xFF01, 0x3FC0, 0x3E80, 0xFE41,
				0xFA01, 0x3AC0, 0x3B80, 0xFB41, 0x3900, 0xF9C1, 0xF881, 0x3840,
				0x2800, 0xE8C1, 0xE981, 0x2940, 0xEB01, 0x2BC0, 0x2A80, 0xEA41,
				0xEE01, 0x2EC0, 0x2F80, 0xEF41, 0x2D00, 0xEDC1, 0xEC81, 0x2C40,
				0xE401, 0x24C0, 0x2580, 0xE541, 0x2700, 0xE7C1, 0xE681, 0x2640,
				0x2200, 0xE2C1, 0xE381, 0x2340, 0xE101, 0x21C0, 0x2080, 0xE041,
				0xA001, 0x60C0, 0x6180, 0xA141, 0x6300, 0xA3C1, 0xA281, 0x6240,
				0x6600, 0xA6C1, 0xA781, 0x6740, 0xA501, 0x65C0, 0x6480, 0xA441,
				0x6C00, 0xACC1, 0xAD81, 0x6D40, 0xAF01, 0x6FC0, 0x6E80, 0xAE41,
				0xAA01, 0x6AC0, 0x6B80, 0xAB41, 0x6900, 0xA9C1, 0xA881, 0x6840,
				0x7800, 0xB8C1, 0xB981, 0x7940, 0xBB01, 0x7BC0, 0x7A80, 0xBA41,
				0xBE01, 0x7EC0, 0x7F80, 0xBF41, 0x7D00, 0xBDC1, 0xBC81, 0x7C40,
				0xB401, 0x74C0, 0x7580, 0xB541, 0x7700, 0xB7C1, 0xB681, 0x7640,
				0x7200, 0xB2C1, 0xB381, 0x7340, 0xB101, 0x71C0, 0x7080, 0xB041,
				0x5000, 0x90C1, 0x9181, 0x5140, 0x9301, 0x53C0, 0x5280, 0x9241,
				0x9601, 0x56C0, 0x5780, 0x9741, 0x5500, 0x95C1, 0x9481, 0x5440,
				0x9C01, 0x5CC0, 0x5D80, 0x9D41, 0x5F00, 0x9FC1, 0x9E81, 0x5E40,
				0x5A00, 0x9AC1, 0x9B81, 0x5B40, 0x9901, 0x59C0, 0x5880, 0x9841,
				0x8801, 0x48C0, 0x4980, 0x8941, 0x4B00, 0x8BC1, 0x8A81, 0x4A40,
				0x4E00, 0x8EC1, 0x8F81, 0x4F40, 0x8D01, 0x4DC0, 0x4C80, 0x8C41,
				0x4400, 0x84C1, 0x8581, 0x4540, 0x8701, 0x47C0, 0x4680, 0x8641,
				0x8201, 0x42C0, 0x4380, 0x8341, 0x4100, 0x81C1, 0x8081, 0x4040,
		};


		byte[] bytes = cadena.getBytes();
		int crc = 0x0000;
		for (byte b : bytes) {
			crc = (crc >>> 8) ^ table[(crc ^ b) & 0xff];
		}

		byte lowByte = (byte)(crc & 0xFF);
		byte penultimateByte = (byte)((crc >> 8) & 0xFF);
		byte arrCRC[]= new byte[2];
		arrCRC[0]=penultimateByte;
		arrCRC[1]=lowByte;

		log.debug("CRC array:" + encodeHexString(arrCRC));
		log.debug("CRC16 = " + Integer.toHexString(crc)); //d45a

		return arrCRC;
	}

	public byte[] concatByteArrays (byte []a,byte[]b)
	{
		byte[] c = new byte[a.length + b.length];
		System.arraycopy(a, 0, c, 0, a.length);
		System.arraycopy(b, 0, c, a.length, b.length);
		return c;
	}


	public static void main(String[] args) throws Exception {
		log.info("Iniciando CentralStationReceiver...");
		String ip =args[0];
		int port =Integer.parseInt(args[1]);


		CentralStationReceiver csr = new CentralStationReceiver(ip,port);


		log.info("Running Server: " + 
				"Host=" + csr.getSocketAddress().getHostAddress() + 
				" Port=" + csr.getPort());

		csr.listen();



	}

}
