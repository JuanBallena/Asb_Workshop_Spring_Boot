package com.asb.workshop.module.parameter.parametersFinder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asb.workshop.model.Parameter;
import com.asb.workshop.queryCriteria.Pagination;
import com.asb.workshop.requestParam.ParameterRequestParam;
import com.asb.workshop.resource.ParameterResource;
import com.asb.workshop.response.ServiceResponse;

@Component
public class ParametersFinderHandler {
	
	@Autowired
	private ParametersFinder parametersFinder;

	public ServiceResponse handle(ParameterRequestParam requestParam)
	{		
		Pagination<Parameter> pagination = parametersFinder.find(new ParametersFinderCriteria(requestParam));
		
		return ServiceResponse.ok(
			"Parameters",
			new ParameterResource().convertList(pagination.getData()), 
			pagination.getTotalPages()
		);
	}
}
