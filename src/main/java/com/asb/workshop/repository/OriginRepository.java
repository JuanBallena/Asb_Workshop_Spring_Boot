package com.asb.workshop.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.asb.workshop.model.Origin;

public interface OriginRepository extends CustomRepository<Origin, Long>, JpaSpecificationExecutor<Origin> {

}
