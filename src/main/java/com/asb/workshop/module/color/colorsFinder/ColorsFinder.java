package com.asb.workshop.module.color.colorsFinder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asb.workshop.model.Color;
import com.asb.workshop.repository.ColorRepository;

@Service
public class ColorsFinder {

	@Autowired
	private ColorRepository colorRepository;
	
	public List<Color> find()
	{
		return colorRepository.findAll();
	}
}
