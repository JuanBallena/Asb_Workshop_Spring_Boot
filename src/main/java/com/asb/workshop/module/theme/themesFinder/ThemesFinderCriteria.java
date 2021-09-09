package com.asb.workshop.module.theme.themesFinder;

import com.asb.workshop.model.Theme;
import com.asb.workshop.queryCriteria.Filter;
import com.asb.workshop.queryCriteria.QueryCriteria;
import com.asb.workshop.requestParam.ThemeRequestParam;
import com.asb.workshop.validator.ValidatorParameterId;

public class ThemesFinderCriteria extends QueryCriteria<Theme> {

	public ThemesFinderCriteria(ThemeRequestParam requestParam)
	{
		if (ValidatorParameterId.isValid(requestParam.idAllowedRole)) {
			
			filters.add(new Filter(Theme.FIELD_ALLOWED_ROLE, requestParam.idAllowedRole));
		}
		
		page = requestParam.page;
		size = requestParam.size;
	}
}
