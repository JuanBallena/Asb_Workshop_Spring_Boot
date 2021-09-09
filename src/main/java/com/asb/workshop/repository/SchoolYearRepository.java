package com.asb.workshop.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.asb.workshop.model.SchoolYear;

public interface SchoolYearRepository extends CustomRepository<SchoolYear, Long>, JpaSpecificationExecutor<SchoolYear> {

}
