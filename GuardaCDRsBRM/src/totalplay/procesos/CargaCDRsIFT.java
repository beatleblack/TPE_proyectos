package totalplay.procesos; 
//import com.totalplay.herramientas.CargaProperties;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Properties;
import oracle.jdbc.OraclePreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.apache.commons.io.FileUtils;

import com.totalplay.conexiones.ConexionPool;
import com.totalplay.herramientas.Math;

import org.apache.log4j.*;

public class CargaCDRsIFT  implements FilenameFilter{

	public CargaCDRsIFT() {
		// TODO Auto-generated constructor stub
	}
	
	public CargaCDRsIFT(String filtro) {
		// TODO Auto-generated constructor stub
		this.filtro=filtro;
	}
	
	protected static Properties prop;
	protected static Logger log;
	private static String rutaProp;
	String filtro;
	File archivo;
	BufferedReader bfr;
	static int cdrsTotales,cdrsInsertados,cdrsArchivo,cdrsInserArchivo,archivosProcesados,archivosProcesadosTotal;
	static Connection dbConn=null;
	static OraclePreparedStatement stmt=null;
	static ResultSet rs=null;	
	protected String queryInsert="insert into TA_HISTORICO_CDRS(NUMERO_ORIGEN,NUMERO_DESTINO,FECHA_INICIO,FECHA_FIN,DURACION,MODALIDAD,SENTIDO,ARCHIVO_ORIGEN) "
			+" values(?,?,to_Date(?,'yyMMddHH24miss'),to_Date(?,'yyMMddHH24miss'),?,?,?,?)";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length<1){
			System.err.println("No se ha recibido archivo properties.");
			System.exit(0);
		}
		rutaProp=args[0];
		File fl=new File(rutaProp);
		if(!fl.exists()){
			System.err.println("No existe archivo properties");
		}
		
		prop=new Properties();
		File configProp=new File(rutaProp);
		try {
			prop.load(new FileInputStream(configProp));
		} catch (Exception e) {
			// TODO: handle exception
		}
		PropertyConfigurator.configure(prop.getProperty("FILELOG"));
		log=Logger.getLogger(CargaCDRsIFT.class);
		cdrsInsertados=0;
		cdrsTotales=0;
		new CargaCDRsIFT().obtenConexion();
		archivosProcesadosTotal=0;
		new CargaCDRsIFT().leeDirectorio(prop.getProperty("PATH_INCOMING"));
		new CargaCDRsIFT().leeDirectorio(prop.getProperty("PATH_OK"));
		
		try {
			dbConn.close();
			log.debug("Conexion a BD cerrada");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.info("\n\n##############################################\nResultado\n##############################################");
		log.info("Total de CDRs le�dos: "+cdrsTotales);
		log.info("Total de CDRs Insertados: "+cdrsInsertados);
		log.info("Total de archivos procesados: "+archivosProcesadosTotal);
		log.info("Proceso Terminado con exito!!!");
		System.exit(0);
	}
	
	private void obtenConexion(){
		log.debug("Realizando conexi�n a BD "+prop.getProperty("DB_IFT"));
		ConexionPool conn=new ConexionPool(prop.getProperty("DBDRIVER_IFT")+","
				+prop.getProperty("DBURL_IFT")+","
				+prop.getProperty("DBUSER_IFT")+","
				+prop.getProperty("DBPASS_IFT")+","
				+prop.getProperty("DB_IFT")+","
				+prop.getProperty("FILELOG"));
		try {
			conn.iniciaPool(1, 1, 3);
			dbConn=conn.getPsd().getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.fatal(e.getMessage());
			System.exit(0);
		}
	}
	
	public void leeDirectorio(String path){
		String arrPath[]=path.split(",");
		log.info("Iniciando Lectura de directorio: "+arrPath[0]);
		File rutaHome=new File(prop.getProperty("HOME_CDRS")+arrPath[0]);
		String arrDir[];
		arrDir=rutaHome.list(new CargaCDRsIFT("txt"));
		cdrsArchivo=0;
		cdrsInserArchivo=0;
		archivosProcesados=0;
		File archivoOrigen;
		File archivoDestino;
		log.debug("PATH de trabajo:"+path);
		log.debug("Directorio del home: "+prop.getProperty("HOME_CDRS"));
		log.debug("Total de archivos a procesar: "+arrDir.length);
		if(arrDir.length>0){
			int archivos=arrDir.length;
			log.info("Archivos a procesar: "+arrDir.length);
			for(int i=0;i<arrDir.length;i++){
				archivos--;
				if(archivos%10==0){
					System.out.println("Faltan "+archivos+" de "+arrDir.length+" por procesar.");
				}
				archivoOrigen=new File(rutaHome.getAbsolutePath()+"/"+arrDir[i]);
				archivoDestino=new File(rutaHome.getAbsolutePath()+"/procesado/"+arrDir[i]);
				leerArchivo(rutaHome.getAbsolutePath()+"/"+arrDir[i],arrDir[i], Integer.parseInt(arrPath[1]));
				archivosProcesados++;
				archivosProcesadosTotal++;
				
				try {
					FileUtils.moveFile(archivoOrigen, archivoDestino);
					
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					log.error(e.getMessage());
				}
			}
		}else {
			log.info("No hay archivos a procesar."); 
		} 
		log.info("CDRs Leidos: "+cdrsArchivo); 
		log.info("CDRs insertados: "+cdrsInserArchivo); 
	} 
	 
	public void leerArchivo(String fl,String nombreFl,int status){ 
		log.debug("Archivo: "+fl+"\nStauts: "+status); 
		archivo=new File(fl); 
		String strLn; 
		try { 
			bfr=new BufferedReader(new FileReader(fl)); 
			while((strLn=bfr.readLine())!=null){ 
				cdrsTotales++; 
				cdrsArchivo++; 
				insertaCDR(strLn, nombreFl, status); 
			} 
		} catch (FileNotFoundException e) { 
			// TODO Auto-generated catch block 
			log.error(e.getMessage()); 
			e.printStackTrace(); 
		} catch (IOException e) { 
			// TODO Auto-generated catch block 
			log.error(e.getMessage()); 
			e.printStackTrace(); 
		}finally { 
			try { 
				bfr.close(); 
			} catch (IOException e) { 
				// TODO Auto-generated catch block 
				e.printStackTrace(); 
			} 
		} 
	} 
	 
	public void insertaCDR(String CDR,String nombreFl,int status){ 
		String	 
			tipo_cdr, 
			numero_origen, 
			numero_destino, 
			fecha_inicio_llamada, 
			fecha_fin_llamada, 
			duracion, 
			nir, 
			modalidad, 
			poblacion, 
			tipo_trafico, 
			sentido, 
			utc, 
			clave_tel 
		; 
		tipo_cdr=CDR.substring(0,2); 
		if(!Math.esNumero(tipo_cdr)){ 
			tipo_cdr="99"; 
		} 
		numero_origen=CDR.substring(3,13); 
		numero_destino=CDR.substring(13,37).trim(); 
		fecha_inicio_llamada=CDR.substring(62,68)+CDR.substring(74,80); 
		fecha_fin_llamada=CDR.substring(68,74)+CDR.substring(80,86); 
		duracion=CDR.substring(86,92).trim(); 
		nir=CDR.substring(134,137).trim(); 
		if(!Math.esNumero(nir)){ 
			nir="0"; 
		} 
		modalidad=CDR.substring(146,148).trim(); 
		if(modalidad.length()>1){
			modalidad=modalidad.substring(0, 1);
		}
		poblacion=CDR.substring(163,213).trim(); 
		tipo_trafico=CDR.substring(213,216); 
		sentido=CDR.substring(240,241); 
		utc=CDR.substring(241,246); 
		clave_tel=CDR.substring(246,255).trim(); 
//		System.out.println(tipo_cdr); 
//		System.out.println(numero_origen); 
//		System.out.println(numero_destino); 
//		System.out.println(fecha_inicio_llamada); 
//		System.out.println(fecha_fin_llamada); 
//		System.out.println(duracion); 
//		System.out.println(nir); 
//		System.out.println(modalidad); 
//		System.out.println(poblacion); 
//		System.out.println(tipo_trafico); 
//		System.out.println(sentido); 
//		System.out.println(utc); 
//		System.out.println(clave_tel); 
//		System.out.println(status); 
//		System.out.println(nombreFl); 
		 
		try { 
			stmt=(OraclePreparedStatement)dbConn.prepareStatement(queryInsert); 
			stmt.setString(1, "4435208405"); 
			stmt.setString(2, numero_destino); 
			stmt.setString(3, fecha_inicio_llamada); 
			stmt.setString(4, fecha_fin_llamada); 
			stmt.setInt(5, Integer.parseInt(duracion)); 
			stmt.setString(6, modalidad); 
			stmt.setString(7, sentido); 
			stmt.setString(8, nombreFl); 
			stmt.executeQuery();		 
			cdrsInsertados++; 
			cdrsInserArchivo++; 
		} catch (SQLException e) { 
			// TODO Auto-generated catch block 
			e.printStackTrace(); 
			log.fatal(e.getMessage()+"\n"+CDR); 
			System.exit(0); 
		}catch (Exception e) { 
			// TODO: handle exception 
			log.error(e.getMessage()+"\n"+CDR); 
		}finally { 
			try { 
				if(rs!=null){
					rs.close(); 
				}
				stmt.close();
			} catch (SQLException e) { 
				// TODO Auto-generated catch block 
				e.printStackTrace(); 
				log.error(e.getLocalizedMessage());
			} 
			 
		} 
	} 
			 
	 
	@Override 
	public boolean accept(File dir, String name) { 
		// TODO Auto-generated method stub 
		return name.endsWith(filtro); 
	} 
}
 
