package com.asb.workshop.module.user.usersFinder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asb.workshop.model.User;
import com.asb.workshop.queryCriteria.Pagination;
import com.asb.workshop.requestParam.UserRequestParam;
import com.asb.workshop.resource.UserResource;
import com.asb.workshop.response.ServiceResponse;

@Component
public class UsersFinderHandler {
	
	@Autowired
	private UsersFinder userFinder;

	public ServiceResponse handle(UserRequestParam requestParam)
	{
		Pagination<User> pagination = userFinder.find(new UsersFinderCriteria(requestParam));
		
		return ServiceResponse.ok(
			"Users", 
			new UserResource().convertList(pagination.getData()), 
			pagination.getTotalPages()
		);
	}
}
