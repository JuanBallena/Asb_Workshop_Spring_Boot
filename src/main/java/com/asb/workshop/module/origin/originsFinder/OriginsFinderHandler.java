package com.asb.workshop.module.origin.originsFinder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asb.workshop.model.Origin;
import com.asb.workshop.response.ServiceResponse;

@Component
public class OriginsFinderHandler {

	@Autowired
	private OriginsFinder originsFinder;
	
	public ServiceResponse handle()
	{
		List<Origin> origins = originsFinder.find();
		
		int totalPages = origins.size() > 0 ? 1 : 0;
		
		return ServiceResponse.ok("Origins", origins, totalPages);
	}
}
