package com.asb.workshop.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asb.workshop.module.user.usersFinder.UsersFinderHandler;
import com.asb.workshop.requestParam.UserRequestParam;
import com.asb.workshop.response.ServiceResponse;

@RestController
public class UsersGetController {

	@Autowired
	private UsersFinderHandler handler;
	
	@GetMapping("/users")
	public ServiceResponse getUsers(UserRequestParam requestParam)
	{
		return handler.handle(requestParam);
	}
}
