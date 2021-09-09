package com.asb.workshop.module.themeType.themeTypesFinder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asb.workshop.model.ThemeType;
import com.asb.workshop.repository.ThemeTypeRepository;

@Service
public class ThemeTypesFinder {

	@Autowired
	private ThemeTypeRepository themeTypeRepository;
	
	public List<ThemeType> find()
	{
		return themeTypeRepository.findAll();
	}
}
