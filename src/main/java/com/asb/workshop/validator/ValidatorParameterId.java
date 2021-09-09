package com.asb.workshop.validator;

public class ValidatorParameterId {

	public static boolean isValid(Long id)
	{
		return id != null & id > 0;
	}
}
