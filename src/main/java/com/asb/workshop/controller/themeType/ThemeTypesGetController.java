package com.asb.workshop.controller.themeType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asb.workshop.module.themeType.themeTypesFinder.ThemeTypesFinderHandler;
import com.asb.workshop.response.ServiceResponse;

@RestController
public class ThemeTypesGetController {

	@Autowired
	private ThemeTypesFinderHandler handler;
	
	@GetMapping("/theme-types")
	public ServiceResponse getThemeTypes()
	{
		return handler.handle();
	}
}
