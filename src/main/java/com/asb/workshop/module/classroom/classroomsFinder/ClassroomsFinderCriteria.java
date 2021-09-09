package com.asb.workshop.module.classroom.classroomsFinder;

import com.asb.workshop.model.Classroom;
import com.asb.workshop.queryCriteria.Filter;
import com.asb.workshop.queryCriteria.OrderCreator;
import com.asb.workshop.queryCriteria.QueryCriteria;
import com.asb.workshop.requestParam.ClassroomRequestParam;
import com.asb.workshop.validator.ValidatorParameterBoolean;

public class ClassroomsFinderCriteria extends QueryCriteria<Classroom> {

	public ClassroomsFinderCriteria(ClassroomRequestParam requestParam)
	{
		if (ValidatorParameterBoolean.isValid(requestParam.visible)) {
			
			filters.add(new Filter(Classroom.FIELD_VISIBLE, requestParam.visible));
		}
		
		orders.add(OrderCreator.create(Classroom.FIELD_ACADEMIC_LEVEL, "asc"));
		orders.add(OrderCreator.create(Classroom.FIELD_GRADE, "asc"));
		orders.add(OrderCreator.create(Classroom.FIELD_SECTION, "asc"));
	}
}
