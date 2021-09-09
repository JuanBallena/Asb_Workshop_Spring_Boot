package com.asb.workshop.module.parameter.parametersFinder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asb.workshop.model.Parameter;
import com.asb.workshop.queryCriteria.FindAll;
import com.asb.workshop.queryCriteria.Pagination;
import com.asb.workshop.repository.ParameterRepository;

@Service
public class ParametersFinder {

	@Autowired
	private ParameterRepository parameterRepository;
	
	@Autowired
	private FindAll<Parameter> findAll;
	
	public Pagination<Parameter> find(ParametersFinderCriteria criteria) 
	{	
		return findAll.find(parameterRepository, criteria);
	}
}
