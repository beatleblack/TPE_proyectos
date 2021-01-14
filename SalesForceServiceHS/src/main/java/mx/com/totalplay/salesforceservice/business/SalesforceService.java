package mx.com.totalplay.salesforceservice.business;

import java.util.HashMap;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import mx.com.totalplay.rcobranza.commons.RCConstants;
import mx.com.totalplay.rcobranza.commons.model.vo.RequestVO;
import mx.com.totalplay.rcobranza.commons.model.vo.ResponseCliVO;
import mx.com.totalplay.rcobranza.commons.model.vo.ResponseVO;
import mx.com.totalplay.salesforceservice.business.validators.SalesforceValidator;
import mx.com.totalplay.salesforceservice.utils.SalesforceServiceConfig;

//TODO Clase que contiene la logica de negocio, llamadas a WS, etc
@Service
public class SalesforceService {
	
	private final Logger LOGGER = LoggerFactory.getLogger(SalesforceService.class);
	
	private RestTemplate restTemplate = new RestTemplate();
	
	private ObjectMapper mapper = new ObjectMapper();

	@Autowired
	SalesforceValidator avayaValidator;

	@PostConstruct
	public void init() throws Exception{
		LOGGER.info("********* Inicia método postConstruct *********");
		LOGGER.info("SF_ENDPOINT_URL_ALERTAS:" + SalesforceServiceConfig.SF_ENDPOINT_URL_ALERTAS);
		LOGGER.info("SF_ENDPOINT_URL_MULTIMEDIA:" + SalesforceServiceConfig.SF_ENDPOINT_URL_MULTIMEDIA);

	}

	public ResponseVO sendEvent(RequestVO dplRequest) throws Exception {
		LOGGER.info("ejecutando sendEvent...");

		LOGGER.info("datos recibidos:");
		LOGGER.info(dplRequest.toString());
		
		ResponseVO dplResponse = new ResponseVO();
		
		try {
			LOGGER.info("validando...");
			avayaValidator.sendEvent(dplRequest, dplResponse);
		}catch (Exception e) {
			return dplResponse;
		}

		String signalID = dplRequest.getParametersMap().get("signalID");
		String signalSeq = dplRequest.getParametersMap().get("signalSeq");
		String account = dplRequest.getParametersMap().get("account");
		String signalTs = dplRequest.getParametersMap().get("signalTs");
		String siaArea = dplRequest.getParametersMap().get("siaArea");
		String siaEvent = dplRequest.getParametersMap().get("siaEvent");
		String siaZone = dplRequest.getParametersMap().get("siaZone");
		String siaUTC = dplRequest.getParametersMap().get("siaUTC");
		String reception_date = dplRequest.getParametersMap().get("reception_date");
		String idEvent = dplRequest.getParametersMap().get("Id");
				
		HashMap<String, String> parametersMap = new HashMap<String, String>();
		parametersMap.put("strNumsignalID", signalID);
		parametersMap.put("signalSeq", signalSeq);
		parametersMap.put("account", account);
		parametersMap.put("signalTs", signalTs);
		parametersMap.put("siaArea", siaArea);
		parametersMap.put("siaEvent", siaEvent);
		parametersMap.put("siaZone", siaZone);
		parametersMap.put("siaUTC", siaUTC);
		parametersMap.put("reception_date", reception_date);
		parametersMap.put("Id", idEvent);
		
		ResponseCliVO resp = new ResponseCliVO();		
		try {
			LOGGER.info("Enviando parametros a servicio[" + parametersMap  + "]");
			LOGGER.info("URI[" + SalesforceServiceConfig.SF_ENDPOINT_URL_ALERTAS  + "]");
			resp = restTemplate.postForObject(SalesforceServiceConfig.SF_ENDPOINT_URL_ALERTAS, parametersMap, ResponseCliVO.class);			
		} catch (Exception e) {
			LOGGER.error("Ocurrio un error al invocar el servicio...", e);
			dplResponse.setDplCode(RCConstants.WS_ERROR_CODE);
			dplResponse.setDplMessage(RCConstants.WS_ERROR_MSG + " DBTP_SERVICE, URL:" + SalesforceServiceConfig.SF_ENDPOINT_URL_ALERTAS);
			dplResponse.setObjRequest(dplRequest);
			dplResponse.setDetails(e.getMessage());
			dplResponse.setRetry(Boolean.TRUE);			
			throw new Exception();
		}

    	
    	dplResponse.setDplCode(resp.getDplCode());
    	dplResponse.setElementMessage(resp.getElementMessage());
		dplResponse.setObjRequest(dplRequest);
		
		return dplResponse;
	}

	public ResponseVO sendMMS(RequestVO dplRequest) {
		LOGGER.info("ejecutando sendEventMMS...");

		LOGGER.info("datos recibidosMMS:");
		LOGGER.info(dplRequest.toString());
		
		ResponseVO dplResponse = new ResponseVO();
		
		try {
			LOGGER.info("validandoMMS...");
			avayaValidator.sendMMS(dplRequest, dplResponse);
		}catch (Exception e) {
			return dplResponse;
		}

		String account = dplRequest.getParametersMap().get("account");
		String signalSeq = dplRequest.getParametersMap().get("signalseq");
		String signalTs = dplRequest.getParametersMap().get("signalTs");
		String device = dplRequest.getParametersMap().get("device");
		String mmeURL = dplRequest.getParametersMap().get("mme_url");
		String Id = dplRequest.getParametersMap().get("Id");
		
		HashMap<String, String> parametersMap = new HashMap<String, String>();
		parametersMap.put("account", account);
		parametersMap.put("signalseq", signalSeq);
		parametersMap.put("signalTs", signalTs);
		parametersMap.put("device", device);
		parametersMap.put("mme_url", mmeURL);
		parametersMap.put("Id", Id);

		LOGGER.info (""
				+ "account:" + account + ", signalseq:" + signalSeq + ", mme_url:" +mmeURL + ", device:" + device + ", signalts:" + signalTs + ",Id:" + Id);
		ResponseCliVO resp = new ResponseCliVO();
		
		//String uri;
		try {		    	    
			//uri = "https://qa-knowledge-qa-tp.cs3.force.com/AlarmaHogarSeguroImg/services/apexrest/ws_AlarmaACD_Hogar_Seguro_Img";
			LOGGER.info ("Eviando peticion a URL:" + SalesforceServiceConfig.SF_ENDPOINT_URL_MULTIMEDIA);
			
			resp = restTemplate.postForObject(SalesforceServiceConfig.SF_ENDPOINT_URL_MULTIMEDIA, parametersMap, ResponseCliVO.class);
					
		} catch (Exception e) {
			LOGGER.error("Ocurrio un error al invocar el servicio...", e);
			dplResponse.setDplCode(RCConstants.WS_ERROR_CODE);
			dplResponse.setDplMessage(RCConstants.WS_ERROR_MSG + " DBTP_SERVICE, URL:" + SalesforceServiceConfig.SF_ENDPOINT_URL_MULTIMEDIA);
			dplResponse.setObjRequest(dplRequest);
			dplResponse.setDetails(e.getMessage());
			dplResponse.setRetry(Boolean.TRUE);		
		}
		
    	dplResponse.setDplCode(resp.getDplCode());
    	dplResponse.setElementMessage(resp.getElementMessage());
		dplResponse.setObjRequest(dplRequest);
		
		return dplResponse;
	}

	
}
