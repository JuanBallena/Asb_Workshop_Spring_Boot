package com.asb.workshop.module.user.usersFinder;

import com.asb.workshop.model.User;
import com.asb.workshop.queryCriteria.Filter;
import com.asb.workshop.queryCriteria.OrderCreator;
import com.asb.workshop.queryCriteria.QueryCriteria;
import com.asb.workshop.requestParam.UserRequestParam;
import com.asb.workshop.validator.OrderByParameterValidator;
import com.asb.workshop.validator.OrderTypeParameterValidator;
import com.asb.workshop.validator.ValidatorParameterId;
import com.asb.workshop.validator.ValidatorParameterText;

public class UsersFinderCriteria extends QueryCriteria<User> {

	public UsersFinderCriteria(UserRequestParam requestParam)
	{
		if (ValidatorParameterId.isValid(requestParam.idUser)) {
			
			filters.add(new Filter(User.FIELD_ID_USER, requestParam.idUser));
		}
		
		if (ValidatorParameterText.isValid(requestParam.username)) {
			
			filters.add(new Filter(User.FIELD_USERNAME, requestParam.username));
		}
		
		if (ValidatorParameterId.isValid(requestParam.idRole)) {
			
			filters.add(new Filter(User.FIELD_ROLE, requestParam.idRole));
		}
		
		if (ValidatorParameterText.isValid(requestParam.name)) {
			
			filters.add(new Filter(User.FIELD_NAME, requestParam.name));
		}
		
		if (ValidatorParameterText.isValid(requestParam.lastName)) {
			
			filters.add(new Filter(User.FIELD_LAST_NAME, requestParam.lastName));
		}
		
		if (OrderByParameterValidator.isValid(requestParam.orderBy, User.allowedSorts) & OrderTypeParameterValidator.isValid(requestParam.orderType)) {
			
			orders.add(OrderCreator.create(requestParam.orderBy, requestParam.orderType));
		}
		
		page = requestParam.page;
		size = requestParam.size;
	}
}
