package com.asb.workshop.controller.classroom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asb.workshop.module.classroom.classroomsFinder.ClassroomsFinderHandler;
import com.asb.workshop.requestParam.ClassroomRequestParam;
import com.asb.workshop.response.ServiceResponse;

@RestController
public class ClassroomsGetController {
	
	@Autowired
	private ClassroomsFinderHandler handler;

	@GetMapping("/classrooms")
	public ServiceResponse getClassrooms(ClassroomRequestParam requestParam)
	{
		return handler.handle(requestParam);
	}
}
