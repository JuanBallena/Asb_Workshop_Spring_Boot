package com.asb.workshop.resource;

import java.util.List;
import java.util.stream.Collectors;

public abstract class ResourceConverter<M,R> {

	public abstract R convert(M m);
	
	public List<R> convertList(List<M> list) 
	{	
		return list.stream().map(m -> convert(m)).collect(Collectors.toList());
	}
}
