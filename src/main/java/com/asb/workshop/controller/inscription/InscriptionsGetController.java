package com.asb.workshop.controller.inscription;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asb.workshop.module.inscription.inscriptionsFinder.InscriptionsFinderHandler;
import com.asb.workshop.requestParam.InscriptionRequestParam;
import com.asb.workshop.response.ServiceResponse;

@RestController
public class InscriptionsGetController {

	@Autowired
	private InscriptionsFinderHandler handler;
	
	@GetMapping("/inscriptions")
	public ServiceResponse getInscriptions(InscriptionRequestParam requestParam)
	{
		return handler.handle(requestParam);
	}
}
