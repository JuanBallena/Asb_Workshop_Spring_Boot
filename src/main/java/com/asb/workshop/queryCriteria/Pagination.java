package com.asb.workshop.queryCriteria;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Pagination<T> {

	private List<T> data = new ArrayList<T>();
	private int totalPages = 0;
	
	public Boolean hasData() 
	{	
		return this.data.size() > 0;
	}
}