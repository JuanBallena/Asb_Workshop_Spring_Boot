package com.asb.workshop.controller.color;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asb.workshop.module.color.colorsFinder.ColorsFinderHandler;
import com.asb.workshop.response.ServiceResponse;

@RestController
public class ColorsGetController {

	@Autowired
	private ColorsFinderHandler handler;
	
	@GetMapping("/colors")
	public ServiceResponse getColors()
	{
		return handler.handle();
	}
}
