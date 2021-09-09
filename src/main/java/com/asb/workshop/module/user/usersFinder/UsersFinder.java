package com.asb.workshop.module.user.usersFinder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asb.workshop.model.User;
import com.asb.workshop.queryCriteria.FindAll;
import com.asb.workshop.queryCriteria.Pagination;
import com.asb.workshop.repository.UserRepository;

@Service
public class UsersFinder {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private FindAll<User> findAll;
	
	public Pagination<User> find(UsersFinderCriteria criteria)
	{
		return findAll.find(userRepository, criteria);
	}
}
