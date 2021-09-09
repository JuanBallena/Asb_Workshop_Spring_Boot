package com.asb.workshop.resource;

import com.asb.workshop.model.Classroom;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClassroomResource extends ResourceConverter<Classroom, ClassroomResource>{

	public Long idClassroom;
	public String academicLevel;
	public String classroom;
	public Boolean visible;
	
	@Override
	public ClassroomResource convert(Classroom classroom) 
	{	
		return ClassroomResource.builder()
				.idClassroom(classroom.getIdClassroom())
				.academicLevel(classroom.getAcademicLevel().getDescription())
				.classroom(classroom.getClassroom())
				.visible(classroom.getVisible())
				.build();
	}

}
