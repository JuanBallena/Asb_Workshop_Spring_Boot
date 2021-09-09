package com.asb.workshop.response;

import java.util.ArrayList;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Setter
@Getter
public class ServiceResponse {
	
	private String token;
	private int status;
	private String message;
	private String resourceType;
	private Object data;
	private int pages;
	private List<ErrorBack> errors;

	public static ServiceResponse ok(String resourceType, Object data, int pages)
	{
		return ServiceResponse.builder()
				.token("")
				.status(200)
				.message("Ok")
				.resourceType(resourceType)
				.data(data)
				.pages(pages)
				.errors(new ArrayList<ErrorBack>())
				.build();
	}
	
	public static ServiceResponse created(String resourceType, Object data)
	{
		return ServiceResponse.builder()
				.token("")
				.status(201)
				.message("Registro exitoso")
				.resourceType(resourceType)
				.data(data)
				.pages(0)
				.errors(new ArrayList<ErrorBack>())
				.build();
	}
	
	public static ServiceResponse badRequest(String message)
	{
		return ServiceResponse.builder()
				.token("")
				.status(400)
				.message(message)
				.resourceType("")
				.data(null)
				.pages(0)
				.errors(new ArrayList<ErrorBack>())
				.build();
	}
	
	public static ServiceResponse badRequest(List<ErrorBack> errorsBack)
	{
		return ServiceResponse.builder()
				.token("")
				.status(400)
				.message("Error de solicitud")
				.resourceType("")
				.data(null)
				.pages(0)
				.errors(errorsBack)
				.build();
	}
}
