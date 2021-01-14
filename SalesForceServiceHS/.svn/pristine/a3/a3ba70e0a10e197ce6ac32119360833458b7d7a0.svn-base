package mx.com.totalplay.salesforceservice.business.validators;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import mx.com.totalplay.rcobranza.commons.RCConstants;
import mx.com.totalplay.rcobranza.commons.model.vo.RequestVO;
import mx.com.totalplay.rcobranza.commons.model.vo.ResponseVO;

//TODO Clase que hace las validaciones de los datos recibidos
@Component
public class SalesforceValidator {

	public void sendEvent(RequestVO dplRequest, ResponseVO dplResponse) throws Exception {
		if( dplRequest == null ){
			dplResponse.setDplCode(RCConstants.NO_PARAMS_ERROR_CODE);
			dplResponse.setDplMessage("No existe información para la operacion sendEvent");
			throw new Exception("No existe información de enrutamiento");
		}

		if( !StringUtils.hasText(dplRequest.getParametersMap().get("signalID")) ){
			dplResponse.setDplCode(RCConstants.NO_PARAMS_ERROR_CODE);
			dplResponse.setDplMessage("El campo signalID es obligatorio");
			throw new Exception("El campo signalID es obligatorio.");
		}
		
		if( !StringUtils.hasText(dplRequest.getParametersMap().get("signalSeq")) ){
			dplResponse.setDplCode(RCConstants.NO_PARAMS_ERROR_CODE);
			dplResponse.setDplMessage("El campo signalSeq es obligatorio");
			throw new Exception("El campo signalSeq es obligatorio.");
		}
		if( !StringUtils.hasText(dplRequest.getParametersMap().get("account")) ){
			dplResponse.setDplCode(RCConstants.NO_PARAMS_ERROR_CODE);
			dplResponse.setDplMessage("El campo account es obligatorio");
			throw new Exception("El campo account es obligatorio.");
		}
		
		if( !StringUtils.hasText(dplRequest.getParametersMap().get("signalTs")) ){
			dplResponse.setDplCode(RCConstants.NO_PARAMS_ERROR_CODE);
			dplResponse.setDplMessage("El campo signalTs es obligatorio");
			throw new Exception("El campo signalTs es obligatorio.");
		}
		if( !StringUtils.hasText(dplRequest.getParametersMap().get("siaArea")) ){
			dplResponse.setDplCode(RCConstants.NO_PARAMS_ERROR_CODE);
			dplResponse.setDplMessage("El campo siaArea es obligatorio");
			throw new Exception("El campo siaArea es obligatorio.");
		}
		
		if( !StringUtils.hasText(dplRequest.getParametersMap().get("siaEvent")) ){
			dplResponse.setDplCode(RCConstants.NO_PARAMS_ERROR_CODE);
			dplResponse.setDplMessage("El campo siaEvent es obligatorio");
			throw new Exception("El campo siaEvent es obligatorio.");
		}
		if( !StringUtils.hasText(dplRequest.getParametersMap().get("siaZone")) ){
			dplResponse.setDplCode(RCConstants.NO_PARAMS_ERROR_CODE);
			dplResponse.setDplMessage("El campo siaZone es obligatorio");
			throw new Exception("El campo siaZone es obligatorio.");
		}
		
		if( !StringUtils.hasText(dplRequest.getParametersMap().get("siaUTC")) ){
			dplResponse.setDplCode(RCConstants.NO_PARAMS_ERROR_CODE);
			dplResponse.setDplMessage("El campo siaUTC es obligatorio");
			throw new Exception("El campo siaUTC es obligatorio.");
		}
		if( !StringUtils.hasText(dplRequest.getParametersMap().get("reception_date")) ){
			dplResponse.setDplCode(RCConstants.NO_PARAMS_ERROR_CODE);
			dplResponse.setDplMessage("El campo reception_date es obligatorio");
			throw new Exception("El campo reception_date es obligatorio.");
		}
		
		if( !StringUtils.hasText(dplRequest.getParametersMap().get("Id")) ){
			dplResponse.setDplCode(RCConstants.NO_PARAMS_ERROR_CODE);
			dplResponse.setDplMessage("El campo Id es obligatorio");
			throw new Exception("El campo Id es obligatorio.");
		}
	}

	//account|signalseq|signalts|device|mme_url|Id
	public void sendMMS(RequestVO dplRequest, ResponseVO dplResponse) throws Exception {
		if( dplRequest == null ){
			dplResponse.setDplCode(RCConstants.NO_PARAMS_ERROR_CODE);
			dplResponse.setDplMessage("No existe información para la operacion sendEvent");
			throw new Exception("No existe información de enrutamiento");
		}

		if( !StringUtils.hasText(dplRequest.getParametersMap().get("account")) ){
			dplResponse.setDplCode(RCConstants.NO_PARAMS_ERROR_CODE);
			dplResponse.setDplMessage("El campo account es obligatorio");
			throw new Exception("El campo account es obligatorio.");
		}
		
		if( !StringUtils.hasText(dplRequest.getParametersMap().get("signalseq")) ){
			dplResponse.setDplCode(RCConstants.NO_PARAMS_ERROR_CODE);
			dplResponse.setDplMessage("El campo signalseq es obligatorio");
			throw new Exception("El campo signalseq es obligatorio.");
		}
		
		if( !StringUtils.hasText(dplRequest.getParametersMap().get("signalTs")) ){
			dplResponse.setDplCode(RCConstants.NO_PARAMS_ERROR_CODE);
			dplResponse.setDplMessage("El campo signalts es obligatorio");
			throw new Exception("El campo signalts es obligatorio.");
		}
		if( !StringUtils.hasText(dplRequest.getParametersMap().get("device")) ){
			dplResponse.setDplCode(RCConstants.NO_PARAMS_ERROR_CODE);
			dplResponse.setDplMessage("El campo device es obligatorio");
			throw new Exception("El campo device es obligatorio.");
		}
		
		if( !StringUtils.hasText(dplRequest.getParametersMap().get("mme_url")) ){
			dplResponse.setDplCode(RCConstants.NO_PARAMS_ERROR_CODE);
			dplResponse.setDplMessage("El campo mme_url es obligatorio");
			throw new Exception("El campo mme_url es obligatorio.");
		}
		
		if( !StringUtils.hasText(dplRequest.getParametersMap().get("Id")) ){
			dplResponse.setDplCode(RCConstants.NO_PARAMS_ERROR_CODE);
			dplResponse.setDplMessage("El campo Id es obligatorio");
			throw new Exception("El campo Id es obligatorio.");
		}
		
	}

	
}
