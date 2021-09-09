package com.asb.workshop.module.schoolYear.schoolYearsFinder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asb.workshop.model.SchoolYear;
import com.asb.workshop.repository.SchoolYearRepository;

@Service
public class SchoolYearsFinder {

	@Autowired
	private SchoolYearRepository schoolYearRepository;
	
	public List<SchoolYear> find()
	{
		return schoolYearRepository.findAll();
	}
}
