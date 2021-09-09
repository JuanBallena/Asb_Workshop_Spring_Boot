package com.asb.workshop.resource;

import com.asb.workshop.model.Parameter;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParameterResource extends ResourceConverter<Parameter, ParameterResource>{
	
	public Long idParameter;
	public Long idParameterType;
	public String descrpition;

	@Override
	public ParameterResource convert(Parameter parameter) 
	{
		return ParameterResource.builder()
				.idParameter(parameter.getIdParameter())
				.idParameterType(parameter.getParameterType().getIdParameterType())
				.descrpition(parameter.getDescription())
				.build();
	}
}
