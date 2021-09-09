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
@Table(name="classrooms")
@Entity
public class Classroom {

	public static final String FIELD_ACADEMIC_LEVEL = "academicLevel";
	public static final String FIELD_GRADE = "grade";
	public static final String FIELD_SECTION = "section";
	public static final String FIELD_VISIBLE = "visible";
	
	@Id
	@Column(name = "idClassroom")
	private Long idClassroom;
	
	@ManyToOne
	@JoinColumn(name = "id003AcademicLevel")
	private Parameter academicLevel;
	
	@ManyToOne
	@JoinColumn(name = "id004Grade")
	private Parameter grade;
	
	@ManyToOne
	@JoinColumn(name = "id005Section")
	private Parameter section;
	
	@Column(name = "visible")
	private Boolean visible;
	
	public String getClassroom()
	{
		return grade.getDescription() + " " + section.getDescription();
	}
}
