package com.asb.workshop.module.inscription.inscriptionsFinder;

import com.asb.workshop.model.Inscription;
import com.asb.workshop.queryCriteria.Filter;
import com.asb.workshop.queryCriteria.QueryCriteria;
import com.asb.workshop.requestParam.InscriptionRequestParam;
import com.asb.workshop.validator.ValidatorParameterId;

public class InscriptionsFinderCriteria extends QueryCriteria<Inscription> {

	public InscriptionsFinderCriteria(InscriptionRequestParam requestParam)
	{
		if (ValidatorParameterId.isValid(requestParam.idClassroom)) {
			
			filters.add(new Filter(Inscription.FIELD_CLASSROOM, requestParam.idClassroom));
		}
		
		if (ValidatorParameterId.isValid(requestParam.idSchoolYear)) {
			
			filters.add(new Filter(Inscription.FIELD_SCHOOL_YEAR, requestParam.idSchoolYear));
		}
	}
}
