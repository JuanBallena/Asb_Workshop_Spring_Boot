package com.asb.workshop.module.classroom.classroomsFinder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.asb.workshop.model.Classroom;
import com.asb.workshop.queryCriteria.Pagination;
import com.asb.workshop.requestParam.ClassroomRequestParam;
import com.asb.workshop.resource.ClassroomResource;
import com.asb.workshop.response.ServiceResponse;

@Component
public class ClassroomsFinderHandler {

	@Autowired
	private ClassroomsFinder classroomsFinder;
	
	public ServiceResponse handle(ClassroomRequestParam requestParam)
	{
		Pagination<Classroom> pagination = classroomsFinder.find(new ClassroomsFinderCriteria(requestParam));
		
		return ServiceResponse.ok(
			"Classrooms", 
			new ClassroomResource().convertList(pagination.getData()), 
			pagination.getTotalPages()
		);
	}
}
