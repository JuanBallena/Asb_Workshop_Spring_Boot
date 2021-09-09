package com.asb.workshop.queryCriteria;

import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;

public class OrderCreator {

	public static final Order create(String field, String direction) 
	{
		return direction.equals("asc") ? new Order(Direction.ASC, field) : new Order(Direction.DESC, field);
	}
}
