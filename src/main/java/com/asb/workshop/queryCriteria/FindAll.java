package com.asb.workshop.queryCriteria;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Component;

import com.asb.workshop.repository.CustomRepository;

@Component
public class FindAll<T> {

	public <R extends CustomRepository<T, Long> & JpaSpecificationExecutor<T>> Pagination<T> find(R repository, QueryCriteria<T> criteria) 
	{	
		if (criteria.hasFiltering() & criteria.hasSorting() & criteria.hasPaging()) {
			
			Page<T> page = repository.findAll(criteria.filterSpecification(), criteria.pageRequestAndSort());
			
			return new Pagination<T>(page.getContent(), page.getTotalPages());
		}
		
		if (criteria.hasFiltering() & criteria.hasSorting()) {
			
			List<T> list = repository.findAll(criteria.filterSpecification(), criteria.sort());
			
			return new Pagination<T>(list, this.totalPages(list));
		}
		
		if (criteria.hasFiltering() & criteria.hasPaging()) {
			
			Page<T> page = repository.findAll(criteria.filterSpecification(), criteria.pageRequest());
			
			return new Pagination<T>(page.getContent(), page.getTotalPages());
		}
		
		if (criteria.hasSorting() & criteria.hasPaging()) {
			
			Page<T> page = repository.findAll(criteria.pageRequestAndSort());
			
			return new Pagination<T>(page.getContent(), page.getTotalPages());
		}
		
		if (criteria.hasFiltering()) {
			
			List<T> list = repository.findAll(criteria.filterSpecification());
			
			return new Pagination<T>(list, this.totalPages(list));
		}
		
		if (criteria.hasSorting()) {
			
			List<T> list = repository.findAll(criteria.sort());
			
			return new Pagination<T>(list, this.totalPages(list));
		}
		
		if (criteria.hasPaging()) {
			
			Page<T> page = repository.findAll(criteria.pageRequest());
			
			return new Pagination<T>(page.getContent(), page.getTotalPages());
		}
		
		List<T> list = repository.findAll();
		
		return new Pagination<T>(list, this.totalPages(list));
	}
	
	private int totalPages(List<T> list) 
	{	
		return list.size() == 0 ? 0 : 1;
	}
}
