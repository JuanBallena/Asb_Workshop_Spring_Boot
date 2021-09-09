package com.asb.workshop.validator;

import java.util.List;

public class OrderByParameterValidator {

	public static boolean isValid(String orderBy, List<String> allowedSorts)
	{
		return !orderBy.equals("") & allowedSorts.contains(orderBy);
	}
}
