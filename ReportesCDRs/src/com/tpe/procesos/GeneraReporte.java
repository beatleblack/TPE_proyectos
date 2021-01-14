 package com.tpe.procesos;
 
 import java.io.BufferedReader;
 import java.io.File;
 import java.io.FileInputStream;
 import java.io.FileNotFoundException;
 import java.io.FileReader;
 import java.io.FileWriter;
 import java.io.IOException;
 import java.io.PrintWriter;
 import java.util.HashMap;
 import java.util.Map;
 import java.util.Properties;
 import org.apache.log4j.Logger;
 import org.apache.log4j.PropertyConfigurator;
 
 
 public class GeneraReporte
 {
   protected static Properties prop;
   private static String rutaProp;
   
   public GeneraReporte() {}
   
   public GeneraReporte(long segundos, long minutos, long llamadas) {
     this.segundos = segundos;
     this.minutos = minutos;
     this.llamadas = llamadas;
   }
 
 
   
   BufferedReader bfr = null;
   protected static Logger log;
   static PrintWriter pwr = null;
   static FileWriter fwr = null;
   File fl = null;
   String strLn;
   String[] strArr;
   StringBuilder stbKey = null;
   static Map<String, GeneraReporte> mapReporte = new HashMap<>();
   
   long segundos;
   long llamadas;
   long minutos;
   long tmpSeg;
   long tmpMin;
   long tmpCdr;
   long count;
   
   public static void main(String[] arg) {
     if (arg.length < 1) {
       System.err.println("No se ha recibido archivo properties.");
       System.exit(0);
     } 
     rutaProp = arg[0];
     File fl = new File(rutaProp);
     if (!fl.exists()) {
       System.err.println("No existe archivo properties");
     }
     prop = new Properties();
     File configProp = new File(rutaProp);
     try {
       prop.load(new FileInputStream(configProp));
     } catch (Exception exception) {}
 
     
     PropertyConfigurator.configure(prop.getProperty("RUTA_LOG"));
     log = Logger.getLogger(GeneraReporte.class);
     
     long minEntrada = 0L;
     long segEntrada = 0L;
     long llamEntrada = 0L;
     long minFiltros = 0L;
     long segFiltros = 0L;
     long llamFiltros = 0L;
     long minOKBRM = 0L;
     long segOKBRM = 0L;
     long llamOKBRM = 0L;
     long minEXTRA = 0L;
     long segEXTRA = 0L;
     long llamEXTRA = 0L;
 
 
 
 
 
 
 
     
     fl = new File(prop.getProperty("RUTA_ORIGEN_ARCHIVOS"));
     log.debug(fl.getAbsolutePath());
     String[] fileArr = fl.list();
     for (int j = 0; j < fileArr.length; j++) {
       fl = new File(String.valueOf(prop.getProperty("RUTA_ORIGEN_ARCHIVOS")) + fileArr[j]);
       if (fl.isFile()) {
         log.debug("Procesando Archivo: " + fileArr[j]);
         if (fileArr[j].startsWith("Entrada")) {
           (new GeneraReporte()).leerEntrada(String.valueOf(prop.getProperty("RUTA_ORIGEN_ARCHIVOS")) + fileArr[j], fileArr[j].substring(0, fileArr[j].indexOf("_")));
         } else if (fileArr[j].startsWith("Fil") && fileArr[j].endsWith("txt")) {
           (new GeneraReporte()).leerSalida(String.valueOf(prop.getProperty("RUTA_ORIGEN_ARCHIVOS")) + fileArr[j], fileArr[j].substring(0, fileArr[j].indexOf("_")));
         } else if (fileArr[j].startsWith("Fil") && fileArr[j].endsWith("csv")) {
           (new GeneraReporte()).leerSalidaFiltrosBRM(String.valueOf(prop.getProperty("RUTA_ORIGEN_ARCHIVOS")) + fileArr[j], fileArr[j].substring(0, fileArr[j].indexOf("_")));
         } else if (fileArr[j].startsWith("OK")) {
           (new GeneraReporte()).leerSalidaBRM(String.valueOf(prop.getProperty("RUTA_ORIGEN_ARCHIVOS")) + fileArr[j], fileArr[j].substring(0, fileArr[j].indexOf("_")));
         } else if (fileArr[j].startsWith("Extra")) {
           (new GeneraReporte()).leerSalidaFiltrosBRM(String.valueOf(prop.getProperty("RUTA_ORIGEN_ARCHIVOS")) + fileArr[j], fileArr[j].substring(0, fileArr[j].indexOf("_")));
         } else {
           log.info("Archivo omitido: " + fileArr[j]);
         } 
       } else {
         log.debug("Omitiendo Directorio: " + fileArr[j]);
       } 
     } 
 
     
     try {
       fwr = new FileWriter(String.valueOf(prop.getProperty("RUTA_DESTINO_REPORTE")) + arg[1] + ".txt");
       pwr = new PrintWriter(fwr);
       pwr.println("AGRUPADO PARA CDRS A LA ENTRADA DE DPL");
       pwr.println("FLUJO|FECHA|TIPO_EVENTO|LLAMADAS|SEGUNDOS|MINUTOS");
       for (Map.Entry<String, GeneraReporte> me : mapReporte.entrySet()) {
         if (((String)me.getKey()).contains("EntradaC5")) {
           System.out.println(String.valueOf(me.getKey()) + "|" + ((GeneraReporte)me.getValue()).llamadas + "|" + ((GeneraReporte)me.getValue()).segundos + "|" + ((GeneraReporte)me.getValue()).minutos);
           pwr.println(String.valueOf(me.getKey()) + "|" + ((GeneraReporte)me.getValue()).llamadas + "|" + ((GeneraReporte)me.getValue()).segundos + "|" + ((GeneraReporte)me.getValue()).minutos);
           minEntrada += ((GeneraReporte)me.getValue()).minutos;
           segEntrada += ((GeneraReporte)me.getValue()).segundos;
           llamEntrada += ((GeneraReporte)me.getValue()).llamadas;
         } 
       } 
       pwr.println();
       pwr.println("AGRUPADO PARA CDRS EN LOS FILTROS DE DPL");
       pwr.println("FLUJO|FECHA|LLAMADAS|SEGUNDOS|MINUTOS");
       for (Map.Entry<String, GeneraReporte> me : mapReporte.entrySet()) {
         if (((String)me.getKey()).contains("Fil")) {
           System.out.println(String.valueOf(me.getKey()) + "|" + ((GeneraReporte)me.getValue()).llamadas + "|" + ((GeneraReporte)me.getValue()).segundos + "|" + ((GeneraReporte)me.getValue()).minutos);
           pwr.println(String.valueOf(me.getKey()) + "|" + ((GeneraReporte)me.getValue()).llamadas + "|" + ((GeneraReporte)me.getValue()).segundos + "|" + ((GeneraReporte)me.getValue()).minutos);
           minFiltros += ((GeneraReporte)me.getValue()).minutos;
           segFiltros += ((GeneraReporte)me.getValue()).segundos;
           llamFiltros += ((GeneraReporte)me.getValue()).llamadas;
         } 
       } 
       pwr.println();
       pwr.println("AGRUPADO PARA CDRS ENVIADO A BRM");
       pwr.println("FLUJO|TIPO_CLIENTE|FECHA|LLAMADAS|SEGUNDOS|MINUTOS");
       for (Map.Entry<String, GeneraReporte> me : mapReporte.entrySet()) {
         if (((String)me.getKey()).contains("OK")) {
           System.out.println(String.valueOf(me.getKey()) + "|" + ((GeneraReporte)me.getValue()).llamadas + "|" + ((GeneraReporte)me.getValue()).segundos + "|" + ((GeneraReporte)me.getValue()).minutos);
           pwr.println(String.valueOf(me.getKey()) + "|" + ((GeneraReporte)me.getValue()).llamadas + "|" + ((GeneraReporte)me.getValue()).segundos + "|" + ((GeneraReporte)me.getValue()).minutos);
           minOKBRM += ((GeneraReporte)me.getValue()).minutos;
           segOKBRM += ((GeneraReporte)me.getValue()).segundos;
           llamOKBRM += ((GeneraReporte)me.getValue()).llamadas;
         } 
       } 
       pwr.println();
       pwr.println("AGRUPADO PARA CDRS ENVIADO A BRM por flujos Extras");
       pwr.println("FLUJO|TIPO_CLIENTE|FECHA|LLAMADAS|SEGUNDOS|MINUTOS");
       for (Map.Entry<String, GeneraReporte> me : mapReporte.entrySet()) {
         if (((String)me.getKey()).contains("Extra")) {
           System.out.println(String.valueOf(me.getKey()) + "|" + ((GeneraReporte)me.getValue()).llamadas + "|" + ((GeneraReporte)me.getValue()).segundos + "|" + ((GeneraReporte)me.getValue()).minutos);
           pwr.println(String.valueOf(me.getKey()) + "|" + ((GeneraReporte)me.getValue()).llamadas + "|" + ((GeneraReporte)me.getValue()).segundos + "|" + ((GeneraReporte)me.getValue()).minutos);
           minEXTRA += ((GeneraReporte)me.getValue()).minutos;
           segEXTRA += ((GeneraReporte)me.getValue()).segundos;
           llamEXTRA += ((GeneraReporte)me.getValue()).llamadas;
         } 
       } 
       pwr.println();
       pwr.println();
       pwr.println("############################################################");
       pwr.println("###               Resultado del reporte                  ###");
       pwr.println("############################################################");
       pwr.println();
       pwr.println("Totales a la entrada de DPL");
       pwr.println("Llamadas:\t\t" + llamEntrada);
       pwr.println("Segundos:\t\t" + segEntrada);
       pwr.println("Minutos:\t\t" + minEntrada);
       pwr.println();
       pwr.println("Totales en los filtros de DPL");
       pwr.println("Llamadas:\t\t" + llamFiltros);
       pwr.println("Segundos:\t\t" + segFiltros);
       pwr.println("Minutos:\t\t" + minFiltros);
       pwr.println();
       pwr.println("Totales de lo enviado a BRM por flujo Clase 5");
       pwr.println("Llamadas:\t\t" + llamOKBRM);
       pwr.println("Segundos:\t\t" + segOKBRM);
       pwr.println("Minutos:\t\t" + minOKBRM);
       pwr.println();
 
 
 
 
 
 
       
       pwr.println("Totales de lo enviado a BRM por flujos Extras");
       pwr.println("Llamadas:\t\t" + llamEXTRA);
       pwr.println("Segundos:\t\t" + segEXTRA);
       pwr.println("Minutos:\t\t" + minEXTRA);
     
     }
     catch (IOException e) {
       
       e.printStackTrace();
     } finally {
       try {
         fwr.close();
         pwr.close();
       } catch (IOException e) {
         
         e.printStackTrace();
       } 
     } 
   }
 
   
   public void leerEntrada(String archivo, String flujo) {
     log.info("Leyendo " + flujo);
     log.debug(archivo);
     this.fl = new File(archivo);
     this.count = 0;
     try {
       this.bfr = new BufferedReader(new FileReader(this.fl));
       while ((this.strLn = this.bfr.readLine()) != null) {
         this.count++;
         if (this.count % 100000 == 0) {
           System.out.println(String.valueOf(this.count) + " Lineas procesadas");
         }
         this.stbKey = new StringBuilder();
         this.strArr = this.strLn.split("\\|");
         this.tmpSeg = Integer.parseInt(this.strArr[10]);
         if (this.tmpSeg > 0L) {
           this.tmpMin = this.tmpSeg / 60 + 1;
         } else {
           this.tmpMin = 0L;
         } 
         this.stbKey
           .append(flujo).append("|")
           .append(this.strArr[6].substring(0, 10).replace("-", "")).append("|")
           .append(this.strArr[0]);
         
         if (mapReporte.containsKey(this.stbKey.toString())) {
           this.tmpSeg += ((GeneraReporte)mapReporte.get(this.stbKey.toString())).segundos;
           this.tmpMin += ((GeneraReporte)mapReporte.get(this.stbKey.toString())).minutos;
           this.tmpCdr = 1L + ((GeneraReporte)mapReporte.get(this.stbKey.toString())).llamadas;
           mapReporte.put(this.stbKey.toString(), new GeneraReporte(this.tmpSeg, this.tmpMin, this.tmpCdr)); continue;
         } 
         mapReporte.put(this.stbKey.toString(), new GeneraReporte(this.tmpSeg, this.tmpMin, 1));
       }
     
     } catch (FileNotFoundException e) {
       
       e.printStackTrace();
     } catch (IOException e) {
       
       e.printStackTrace();
     } 
   }
 
   
   public void leerSalida(String archivo, String flujo) {
     log.info("Leyendo " + flujo);
     log.debug(archivo);
     this.fl = new File(archivo);
     this.count = 0L;
     try {
       this.bfr = new BufferedReader(new FileReader(this.fl));
       while ((this.strLn = this.bfr.readLine()) != null) {
         this.count++;
         if (this.count % 100000L == 0L) {
           System.out.println(String.valueOf(this.count) + " Lineas procesadas");
         }
         this.stbKey = new StringBuilder();
         this.strArr = this.strLn.split("\\|");
         this.tmpSeg = Integer.parseInt(this.strArr[11]);
         if (this.tmpSeg > 0L) {
           this.tmpMin = this.tmpSeg / 60 + 1;
         } else {
           this.tmpMin = 0L;
         } 
         this.stbKey
           .append(flujo).append("|")
           .append(this.strArr[6].substring(0, 10).replace("-", ""));
         
         if (mapReporte.containsKey(this.stbKey.toString())) {
           this.tmpSeg += ((GeneraReporte)mapReporte.get(this.stbKey.toString())).segundos;
           this.tmpMin += ((GeneraReporte)mapReporte.get(this.stbKey.toString())).minutos;
           this.tmpCdr = 1L + ((GeneraReporte)mapReporte.get(this.stbKey.toString())).llamadas;
           mapReporte.put(this.stbKey.toString(), new GeneraReporte(this.tmpSeg, this.tmpMin, this.tmpCdr)); continue;
         } 
         mapReporte.put(this.stbKey.toString(), new GeneraReporte(this.tmpSeg, this.tmpMin, 1));
       }
     
     } catch (FileNotFoundException e) {
       log.error(e.getMessage());
       e.printStackTrace();
     } catch (IOException e) {
    	 log.error(e.getMessage());
       e.printStackTrace();
     } catch (Exception e) {
		log.error(e.getMessage());
	}
   }
   public void leerSalidaBRM(String archivo, String flujo) {
     log.info("Leyendo " + flujo);
     log.debug(archivo);
     this.fl = new File(archivo);
     this.count = 0L;
     try {
       this.bfr = new BufferedReader(new FileReader(this.fl));
       while ((this.strLn = this.bfr.readLine()) != null) {
         this.count++;
         if (this.count % 100000L == 0L) {
           System.out.println(String.valueOf(this.count) + " Lineas procesadas");
         }
         this.stbKey = new StringBuilder();
         this.strArr = this.strLn.split(";");
         this.tmpSeg = Integer.parseInt(this.strArr[9]);
         if (this.tmpSeg > 0L) {
           this.tmpMin = this.tmpSeg / 60L + 1L;
         } else {
           this.tmpMin = 0L;
         } 
         if (this.strArr[0].equals("00")) {
           this.strArr[0] = "TP";
         } else if (this.strArr[0].equals("01")) {
           this.strArr[0] = "ENL";
         } else if (this.strArr[0].equals("02")) {
           this.strArr[0] = "TFE";
         } else {
           this.strArr[0] = "NA";
         } 
         this.stbKey
           .append(flujo).append("|")
           .append(this.strArr[0]).append("|")
           .append("20" + this.strArr[5]);
         
         if (mapReporte.containsKey(this.stbKey.toString())) {
           this.tmpSeg += ((GeneraReporte)mapReporte.get(this.stbKey.toString())).segundos;
           this.tmpMin += ((GeneraReporte)mapReporte.get(this.stbKey.toString())).minutos;
           this.tmpCdr = 1L + ((GeneraReporte)mapReporte.get(this.stbKey.toString())).llamadas;
           mapReporte.put(this.stbKey.toString(), new GeneraReporte(this.tmpSeg, this.tmpMin, this.tmpCdr)); continue;
         } 
         mapReporte.put(this.stbKey.toString(), new GeneraReporte(this.tmpSeg, this.tmpMin, 1L));
       }
     
     } catch (FileNotFoundException e) {
       
       e.printStackTrace();
     } catch (IOException e) {
       
       e.printStackTrace();
     } 
   }
   
   public void leerSalidaFiltrosBRM(String archivo, String flujo) {
     log.info("Leyendo " + flujo);
     log.debug(archivo);
     this.fl = new File(archivo);
     this.count = 0L;
     try {
       this.bfr = new BufferedReader(new FileReader(this.fl));
       while ((this.strLn = this.bfr.readLine()) != null) {
         this.count++;
         if (this.count % 100000L == 0L) {
           System.out.println(String.valueOf(this.count) + " Lineas procesadas");
         }
         this.stbKey = new StringBuilder();
         this.strArr = this.strLn.split(";");
         this.tmpSeg = Integer.parseInt(this.strArr[9]);
         if (this.tmpSeg > 0L) {
           this.tmpMin = this.tmpSeg / 60L + 1L;
         } else {
           this.tmpMin = 0L;
         } 
         this.stbKey
           .append(flujo).append("|")
           .append("20" + this.strArr[5]);
         
         if (mapReporte.containsKey(this.stbKey.toString())) {
           this.tmpSeg += ((GeneraReporte)mapReporte.get(this.stbKey.toString())).segundos;
           this.tmpMin += ((GeneraReporte)mapReporte.get(this.stbKey.toString())).minutos;
           this.tmpCdr = 1L + ((GeneraReporte)mapReporte.get(this.stbKey.toString())).llamadas;
           mapReporte.put(this.stbKey.toString(), new GeneraReporte(this.tmpSeg, this.tmpMin, this.tmpCdr)); continue;
         } 
         mapReporte.put(this.stbKey.toString(), new GeneraReporte(this.tmpSeg, this.tmpMin, 1L));
       }
     
     } catch (FileNotFoundException e) {
       
       e.printStackTrace();
     } catch (IOException e) {
       
       e.printStackTrace();
     } 
   }
 }

