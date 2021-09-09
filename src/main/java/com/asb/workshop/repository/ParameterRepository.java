package com.asb.workshop.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.asb.workshop.model.Parameter;

public interface ParameterRepository extends CustomRepository<Parameter, Long>, JpaSpecificationExecutor<Parameter> {

}
