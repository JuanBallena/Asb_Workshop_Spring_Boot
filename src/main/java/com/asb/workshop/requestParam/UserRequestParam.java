package com.asb.workshop.requestParam;

import lombok.Setter;

@Setter
public class UserRequestParam extends PaginationAndSortParameters {

	public Long idUser = 0L;
	public String username = "";
	public Long idRole = 0L;
	public String name = "";
	public String lastName = "";
}
