package com.asb.workshop.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ErrorBack {
	
	private String field;
	private String message;
}
