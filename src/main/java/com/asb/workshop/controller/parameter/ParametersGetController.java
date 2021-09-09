package com.asb.workshop.controller.parameter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asb.workshop.module.parameter.parametersFinder.ParametersFinderHandler;
import com.asb.workshop.requestParam.ParameterRequestParam;
import com.asb.workshop.response.ServiceResponse;

@RestController
public class ParametersGetController {

	@Autowired
	private ParametersFinderHandler handler;
	
	@GetMapping("/parameters")
	public ServiceResponse getParameters(ParameterRequestParam requestParam)
	{	
		return handler.handle(requestParam);
	}
}
