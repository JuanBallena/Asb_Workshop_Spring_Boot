package com.asb.workshop.module.classroom.classroomsFinder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asb.workshop.model.Classroom;
import com.asb.workshop.queryCriteria.FindAll;
import com.asb.workshop.queryCriteria.Pagination;
import com.asb.workshop.repository.ClassroomRepository;

@Service
public class ClassroomsFinder {

	@Autowired
	private ClassroomRepository classroomRepository;
	
	@Autowired
	private FindAll<Classroom> findAll;
	
	public Pagination<Classroom> find(ClassroomsFinderCriteria criteria)
	{
		return findAll.find(classroomRepository, criteria);
	}
}
