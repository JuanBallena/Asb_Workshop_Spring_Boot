package com.asb.workshop.controller.theme;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asb.workshop.module.theme.themesFinder.ThemesFinderHandler;
import com.asb.workshop.requestParam.ThemeRequestParam;
import com.asb.workshop.response.ServiceResponse;

@RestController
public class ThemesGetController {

	@Autowired
	private ThemesFinderHandler handler;
	
	@GetMapping("/themes")
	public ServiceResponse getThemes(ThemeRequestParam requestParam)
	{
		return handler.handle(requestParam);
	}
}
