package com.asb.workshop.validator;

import java.util.Arrays;

public class OrderTypeParameterValidator {

	public static final Boolean isValid(String orderType) 
	{	
		return Arrays.asList("asc", "desc").contains(orderType);
	}
}
