package com.asb.workshop.module.inscription.inscriptionsFinder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asb.workshop.model.Inscription;
import com.asb.workshop.queryCriteria.FindAll;
import com.asb.workshop.queryCriteria.Pagination;
import com.asb.workshop.repository.InscriptionRepository;

@Service
public class InscriptionsFinder {

	@Autowired
	private InscriptionRepository inscriptionRepository;
	
	@Autowired
	private FindAll<Inscription> findAll;
	
	public Pagination<Inscription> find(InscriptionsFinderCriteria criteria)
	{
		return findAll.find(inscriptionRepository, criteria);
	}
}
