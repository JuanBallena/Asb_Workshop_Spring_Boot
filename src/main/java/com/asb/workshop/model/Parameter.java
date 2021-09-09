package com.asb.workshop.model;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@ToString(callSuper=true, includeFieldNames=true)
@Table(name="parameters")
@Entity
public class Parameter {
	
	public static final String FIELD_PARAMETER_TYPE= "parameterType";
	public static final List<String> allowedSorts = Arrays.asList("description");

	@Id
	@Column(name = "idParameter")
	private Long idParameter;
	
	@ManyToOne
	@JoinColumn(name = "idParameterType")
	private ParameterType parameterType;
	
	@Column(name = "description")
	private String description;
}
