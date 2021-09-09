package com.asb.workshop.module.themeType.themeTypesFinder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asb.workshop.model.ThemeType;
import com.asb.workshop.response.ServiceResponse;

@Component
public class ThemeTypesFinderHandler {

	@Autowired
	private ThemeTypesFinder themeTypesFinder;
	
	public ServiceResponse handle()
	{
		List<ThemeType> themeTypes = themeTypesFinder.find();
		
		int totalPages = themeTypes.size() > 0 ? 1 : 0;
		
		return ServiceResponse.ok("Theme types", themeTypes, totalPages);
	}
}
