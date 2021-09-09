package com.asb.workshop.validator;

import java.util.Arrays;

public class ValidatorParameterBoolean {

	public static boolean isValid(Boolean value)
	{
		return value != null & Arrays.asList(true, false).contains(value);
	}
}
