package mx.com.totalplay.salesforceservice.controllers;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mx.com.totalplay.rcobranza.commons.BaseController;
import mx.com.totalplay.rcobranza.commons.RCConstants;
import mx.com.totalplay.rcobranza.commons.model.vo.RequestVO;
import mx.com.totalplay.rcobranza.commons.model.vo.ResponseVO;
import mx.com.totalplay.salesforceservice.business.SalesforceService;

//TODO Clase que expone la logica de negocio, es el WS
@RestController
public class SalesforceController extends BaseController {

	private final Logger LOGGER = LoggerFactory.getLogger(SalesforceController.class);

	@Autowired
	SalesforceService avayaService;

	@RequestMapping("SalesforceService/")
	public String index() {
		return "Salesforce Service v20200821_1400";
	}


	@RequestMapping(value = "/SalesforceService/sendEvent", params = { "params" }, method = RequestMethod.GET)
	public ResponseVO sendEvent(@RequestParam("params") String params, HttpServletRequest request) throws Exception {
		String cleanParams = null;
		ResponseVO dplResponse = new ResponseVO();
		RequestVO dplRequest = null;

		LOGGER.info("Solicitud de sendEvent...");
		LOGGER.info("información recibida:[" + params + "]");

		try {
			cleanParams = getParams(params, dplResponse, RCConstants.NO_PARAMS_ERROR_MSG + " para realizar sendEvent.");
			dplRequest = getRequest(cleanParams, dplResponse);
		} catch (Exception e) {
			return dplResponse;
		}
		
		try {
			dplResponse = avayaService.sendEvent(dplRequest);
        }catch (Exception e) {
			LOGGER.error("Ocurrio un error al enviar evento...", e);
			dplResponse.setDplCode(RCConstants.DEFAULT_ERROR_CODE);
			dplResponse.setDplMessage(RCConstants.DEFAULT_ERROR_MSG );
			dplResponse.setObjRequest(dplRequest);
			dplResponse.setDetails( e.getMessage() );
			dplResponse.setRetry(Boolean.TRUE);
			return dplResponse;
		}
		return dplResponse;	
	}
	
	@RequestMapping(value = "/SalesforceService/sendMMS", params = { "params" }, method = RequestMethod.GET)
	public ResponseVO sendMMS(@RequestParam("params") String params, HttpServletRequest request) throws Exception {
		String cleanParams = null;
		ResponseVO dplResponse = new ResponseVO();
		RequestVO dplRequest = null;

		LOGGER.info("Solicitud de sendEvent...");
		LOGGER.info("información recibida:[" + params + "]");

		try {
			cleanParams = getParams(params, dplResponse, RCConstants.NO_PARAMS_ERROR_MSG + " para realizar sendEvent.");
			dplRequest = getRequest(cleanParams, dplResponse);
		} catch (Exception e) {
			return dplResponse;
		}
		
		try {
			dplResponse = avayaService.sendMMS(dplRequest);
        }catch (Exception e) {
			LOGGER.error("Ocurrio un error al enviar evento...", e);
			dplResponse.setDplCode(RCConstants.DEFAULT_ERROR_CODE);
			dplResponse.setDplMessage(RCConstants.DEFAULT_ERROR_MSG );
			dplResponse.setObjRequest(dplRequest);
			dplResponse.setDetails( e.getMessage() );
			dplResponse.setRetry(Boolean.TRUE);
			return dplResponse;
		}
		return dplResponse;	
	}

}
