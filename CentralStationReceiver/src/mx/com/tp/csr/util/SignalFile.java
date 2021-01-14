package mx.com.tp.csr.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.concurrent.atomic.AtomicLong;

public class SignalFile {
	private static String prefijo="signal_";
	private static String tmp=".tmp";
	private static String posfijo=".dat";
	
	
	final static String unixDir="/home/ec2-user/proyectoGrafosHogarSeguro/hogarSeguroDB/proc/inputFile/in/";
	final static String unixDirProd="/home/userdpl/proyectoGrafosHogarSeguro/hogarSeguroDB/proc/inputFile/in/";
	final static String windowsDir="Z:\\scp\\dplIn\\";

	public static String createFile(String signal,String recordId) throws IOException
	{
		String fileName ="tmp/"+prefijo + recordId + tmp;
		PrintWriter writer = new PrintWriter(fileName, "UTF-8");
		writer.println(signal);
		writer.close();

		String fileNameDest =unixDirProd+prefijo + recordId + posfijo;

		Path temp = Files.move (Paths.get(fileName),
						Paths.get(fileNameDest)); 

		return fileName;

	}

	public static void main(String[] args) throws IOException {	

		//for (int i=0;i<1;i++)
		//{
			
				long timeIni =System.currentTimeMillis();
				String archivo =createFile("Señallll","xxxx");
				long totaltime = System.currentTimeMillis() - timeIni ;
		//}


	}

}
