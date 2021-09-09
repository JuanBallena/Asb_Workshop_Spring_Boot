package com.asb.workshop.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.asb.workshop.model.Classroom;

public interface ClassroomRepository extends CustomRepository<Classroom, Long>, JpaSpecificationExecutor<Classroom> {

}
