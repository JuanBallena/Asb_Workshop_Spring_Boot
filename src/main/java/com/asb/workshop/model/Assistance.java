package com.asb.workshop.model;

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
@Table(name="assistances")
@Entity
public class Assistance {

	@Id
	@Column(name = "idAssistance")
	private Long idAssistance;
	
	@ManyToOne
	@JoinColumn(name = "idActivity")
	private Activity activity;
	
	@ManyToOne
	@JoinColumn(name = "idUser")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "id008AssistanceType")
	private Parameter assistanceType;
	
	@Column(name = "time")
	private Time time;
}
