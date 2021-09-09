package com.asb.workshop.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.asb.workshop.model.Inscription;

public interface InscriptionRepository extends CustomRepository<Inscription, Long>, JpaSpecificationExecutor<Inscription> {

}
