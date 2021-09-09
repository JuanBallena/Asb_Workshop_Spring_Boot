package com.asb.workshop.module.color.colorsFinder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asb.workshop.model.Color;
import com.asb.workshop.response.ServiceResponse;

@Component
public class ColorsFinderHandler {

	@Autowired
	private ColorsFinder colorsFinder;
	
	public ServiceResponse handle()
	{
		List<Color> colors = colorsFinder.find();
		
		int totalPages = colors.size() > 0 ? 1 : 0;
		
		return ServiceResponse.ok("Colors", colors, totalPages);
	}
}
