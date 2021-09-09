package com.asb.workshop.module.parameter.parametersFinder;

import com.asb.workshop.model.Parameter;
import com.asb.workshop.queryCriteria.Filter;
import com.asb.workshop.queryCriteria.OrderCreator;
import com.asb.workshop.queryCriteria.QueryCriteria;
import com.asb.workshop.requestParam.ParameterRequestParam;
import com.asb.workshop.validator.ValidatorParameterId;
import com.asb.workshop.validator.OrderByParameterValidator;
import com.asb.workshop.validator.OrderTypeParameterValidator;

public class ParametersFinderCriteria extends QueryCriteria<Parameter>{

	public ParametersFinderCriteria(ParameterRequestParam requestParam)
	{
		if (ValidatorParameterId.isValid(requestParam.idParameterType)) {
			
			filters.add(new Filter(Parameter.FIELD_PARAMETER_TYPE, requestParam.idParameterType));
		}
		
		if (OrderByParameterValidator.isValid(requestParam.orderBy, Parameter.allowedSorts) & OrderTypeParameterValidator.isValid(requestParam.orderType)) {
			
			orders.add(OrderCreator.create(requestParam.orderBy, requestParam.orderType));
		}
		
		page = requestParam.page;
		size = requestParam.size;
	}
}
