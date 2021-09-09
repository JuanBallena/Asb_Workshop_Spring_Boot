package com.asb.workshop.resource;

import com.asb.workshop.model.User;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserResource extends ResourceConverter<User, UserResource> {
	
	public Long idUser;
	public String username;
	public Long idRole;
	public String role;
	public String name;
	public String lastName;
	public Long idStatus;
	public String status;

	@Override
	public UserResource convert(User user) 
	{	
		return UserResource.builder()
				.idUser(user.getIdUser())
				.username(user.getUsername())
				.idRole(user.getRole().getIdRole())
				.role(user.getRole().getDisplayName())
				.name(user.getName())
				.lastName(user.getLastName())
				.idStatus(user.getStatus().getIdParameter())
				.status(user.getStatus().getDescription())
				.build();
	}
}
