package com.asb.workshop.module.schoolYear.schoolYearsFinder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asb.workshop.model.SchoolYear;
import com.asb.workshop.response.ServiceResponse;

@Component
public class SchoolYearsFinderHandler {

	@Autowired
	private SchoolYearsFinder schoolYearsFinder;
	
	public ServiceResponse handle()
	{
		List<SchoolYear> schoolYears = schoolYearsFinder.find();
		
		int totalPages = schoolYears.size() > 0 ? 1 : 0;
		
		return ServiceResponse.ok("School Years", schoolYears, totalPages);
	}
}
