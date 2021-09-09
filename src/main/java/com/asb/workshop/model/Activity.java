package com.asb.workshop.model;

import java.sql.Date;
import java.sql.Time;

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
@Table(name="activities")
@Entity
public class Activity {

	@Id
	@Column(name = "idActivity")
	private Long idActivity;
	
	@Column(name = "description")
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "idActivityType")
	private ActivityType activityType;
	
	@Column(name = "place")
	private String place;
	
	@Column(name = "startTime")
	private Time startTime;
	
	@Column(name = "endTime")
	private Time endTime;
	
	@Column(name = "date")
	private Date date;
	
	@ManyToOne
	@JoinColumn(name = "id007ActivityStatus")
	private Parameter activityStatus;
	
	@ManyToOne
	@JoinColumn(name = "idAllowedRole")
	private Role allowedRole;
}
