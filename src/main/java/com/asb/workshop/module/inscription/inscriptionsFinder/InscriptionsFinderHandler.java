package com.asb.workshop.module.inscription.inscriptionsFinder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asb.workshop.model.Inscription;
import com.asb.workshop.queryCriteria.Pagination;
import com.asb.workshop.requestParam.InscriptionRequestParam;
import com.asb.workshop.resource.InscriptionResource;
import com.asb.workshop.response.ServiceResponse;

@Component
public class InscriptionsFinderHandler {

	@Autowired
	private InscriptionsFinder inscriptionsFinder;
	
	public ServiceResponse handle(InscriptionRequestParam requestParam)
	{
		Pagination<Inscription> pagination = inscriptionsFinder.find(new InscriptionsFinderCriteria(requestParam));
		
		return ServiceResponse.ok(
			"Inscriptions", 
			new InscriptionResource().convertList(pagination.getData()), 
			pagination.getTotalPages()
		);
	}
}
