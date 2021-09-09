package com.asb.workshop.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.asb.workshop.model.ThemeType;

public interface ThemeTypeRepository extends CustomRepository<ThemeType, Long>, JpaSpecificationExecutor<ThemeType> {

}
