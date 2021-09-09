package com.asb.workshop.requestParam;

import lombok.Setter;

@Setter
public class PaginationAndSortParameters {

	public String orderBy = "";
	public String orderType = "";
	public int page = 0;
	public int size = 0;
}
