package com.asb.workshop.controller.origin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asb.workshop.module.origin.originsFinder.OriginsFinderHandler;
import com.asb.workshop.response.ServiceResponse;

@RestController
public class OriginsGetController {

	@Autowired
	private OriginsFinderHandler handler;
	
	@GetMapping("/origins")
	public ServiceResponse getOrigins()
	{
		return handler.handle();
	}
}
