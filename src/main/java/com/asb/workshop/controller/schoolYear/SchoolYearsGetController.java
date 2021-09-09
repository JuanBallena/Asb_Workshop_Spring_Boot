package com.asb.workshop.controller.schoolYear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asb.workshop.module.schoolYear.schoolYearsFinder.SchoolYearsFinderHandler;
import com.asb.workshop.response.ServiceResponse;

@RestController
public class SchoolYearsGetController {

	@Autowired
	private SchoolYearsFinderHandler handler;
	
	@GetMapping("/school-years")
	public ServiceResponse getSchoolYears()
	{
		return handler.handle();
	}
}
