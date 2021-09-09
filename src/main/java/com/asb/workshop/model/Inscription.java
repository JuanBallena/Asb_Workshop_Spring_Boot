package com.asb.workshop.model;

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
@Table(name="inscriptions")
@Entity
public class Inscription {
	
	public static final String FIELD_CLASSROOM = "classroom";
	public static final String FIELD_SCHOOL_YEAR = "schoolYear";

	@Id
	@Column(name = "idInscription")
	private Long idInscription;
	
	@ManyToOne
	@JoinColumn(name = "idUser")
	private User user;
	
	@ManyToOne
	@JoinColumn(name = "idClassroom")
	private Classroom classroom;
	
	@ManyToOne
	@JoinColumn(name = "id006Turn")
	private Parameter turn;
	
	@ManyToOne
	@JoinColumn(name = "idSchoolYear")
	private SchoolYear schoolYear;
}
