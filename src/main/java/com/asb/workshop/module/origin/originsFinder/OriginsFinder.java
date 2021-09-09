package com.asb.workshop.module.origin.originsFinder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asb.workshop.model.Origin;
import com.asb.workshop.repository.OriginRepository;

@Service
public class OriginsFinder {

	@Autowired
	private OriginRepository originRepository;
	
	public List<Origin> find()
	{
		return originRepository.findAll();
	}
}
