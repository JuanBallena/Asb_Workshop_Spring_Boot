package com.asb.workshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name="activity_types")
@Entity
public class ActivityType {

	@Id
	@Column(name = "idActivityType")
	private Long idActivityType;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
}
