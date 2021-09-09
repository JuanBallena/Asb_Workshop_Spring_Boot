package com.asb.workshop.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.asb.workshop.model.Color;

public interface ColorRepository extends CustomRepository<Color, Long>, JpaSpecificationExecutor<Color> {

}
