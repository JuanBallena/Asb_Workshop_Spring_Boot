package com.asb.workshop.module.theme.themesFinder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asb.workshop.model.Theme;
import com.asb.workshop.queryCriteria.Pagination;
import com.asb.workshop.requestParam.ThemeRequestParam;
import com.asb.workshop.resource.ThemeResource;
import com.asb.workshop.response.ServiceResponse;

@Component
public class ThemesFinderHandler {

	@Autowired
	private ThemesFinder themesFinder;
	
	public ServiceResponse handle(ThemeRequestParam requestParam)
	{
		Pagination<Theme> pagination = themesFinder.find(new ThemesFinderCriteria(requestParam));
		
		return ServiceResponse.ok(
			"Themes", 
			new ThemeResource().convertList(pagination.getData()), 
			pagination.getTotalPages()
		);
	}
}
