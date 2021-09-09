package com.asb.workshop.model;

import java.sql.Timestamp;

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
@Table(name="inscription_periods")
@Entity
public class InscriptionPeriod {

	@Id
	@Column(name = "idInscriptionPeriod")
	private Long idInscriptionPeriod;
	
	@ManyToOne
	@JoinColumn(name = "idInscription")
	private Inscription inscription;
	
	@ManyToOne
	@JoinColumn(name = "id011ReasonStart")
	private Parameter reasonStart;
	
	@ManyToOne
	@JoinColumn(name = "id012EndReason")
	private Parameter endReason;
	
	@Column(name = "startDate")
	private Timestamp startDate;
	
	@Column(name = "endDate")
	private Timestamp endDate;
}
