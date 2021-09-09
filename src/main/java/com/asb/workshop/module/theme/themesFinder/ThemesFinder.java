package com.asb.workshop.module.theme.themesFinder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asb.workshop.model.Theme;
import com.asb.workshop.queryCriteria.FindAll;
import com.asb.workshop.queryCriteria.Pagination;
import com.asb.workshop.repository.ThemeRepository;

@Service
public class ThemesFinder {

	@Autowired
	private ThemeRepository themeRepository;
	
	@Autowired
	private FindAll<Theme> findAll;
	
	public Pagination<Theme> find(ThemesFinderCriteria criteria)
	{
		return findAll.find(themeRepository, criteria);
	}
}
