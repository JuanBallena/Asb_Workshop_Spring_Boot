package com.asb.workshop.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.asb.workshop.model.User;

public interface UserRepository extends CustomRepository<User, Long>, JpaSpecificationExecutor<User> {

}
