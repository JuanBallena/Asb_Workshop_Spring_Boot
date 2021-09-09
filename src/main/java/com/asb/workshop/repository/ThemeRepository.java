package com.asb.workshop.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.asb.workshop.model.Theme;

public interface ThemeRepository extends CustomRepository<Theme, Long>, JpaSpecificationExecutor<Theme> {

}
