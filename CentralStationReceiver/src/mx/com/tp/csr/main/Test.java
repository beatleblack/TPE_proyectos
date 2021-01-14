package mx.com.tp.csr.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Date;

public class Test {


	public static void sendData(byte[] bytes) {



		String hostname = "34.238.190.146";
		int port = 7779;

		try (Socket socket = new Socket(hostname, port)) {

			OutputStream output = socket.getOutputStream();
			output.write(bytes);

			InputStream input = socket.getInputStream();	 
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));	 
			String line;

			while ((line = reader.readLine()) != null) {
				//System.out.println("Respuesta:"+line);
			}
		} catch (UnknownHostException ex) {

			System.out.println("Server not found: " + ex.getMessage());

		} catch (IOException ex) {

			System.out.println("I/O error: " + ex.getMessage());
		}
	}

	public static void main(String[] args) {


		long tiempoIni=java.lang.System.currentTimeMillis();
		for (int i=0;i< 1 ;i++)
		{
			String data="0a6038303033432241444d2d43494422303935304c302335363031395b35363031397c31313331203031203030335d5f32323a35353a34382c30362d30382d323032300d";
			byte arrBytes[] =new BigInteger(data, 16).toByteArray();		

			sendData(arrBytes);
		}
		long tiempoFin=java.lang.System.currentTimeMillis();
		System.out.println("Tiempo total=" + (tiempoFin- tiempoIni));

	}
}
