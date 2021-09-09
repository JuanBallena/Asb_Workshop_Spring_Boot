package com.asb.workshop.model;

import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@ToString(callSuper=true, includeFieldNames=true)
@Table(name="users")
@Entity
public class User {
	
	public static final String FIELD_ID_USER= "idUser";
	public static final String FIELD_USERNAME= "username";
	public static final String FIELD_ROLE= "role";
	public static final String FIELD_NAME= "name";
	public static final String FIELD_LAST_NAME = "lastName";
	
	public static final List<String> allowedSorts = Arrays.asList("lastName");

	@Id
	@Column(name = "idUser")
	private Long idUser;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "password")
	private String password;
	
	@ManyToOne
	@JoinColumn(name = "idRole")
	private Role role;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "lastName")
	private String lastName;
	
	@ManyToOne
	@JoinColumn(name = "id002DocumentType")
	private Parameter documentType;
	
	@Column(name = "document")
	private String document;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "phone")
	private String phone;
	
	@Column(name = "urlPhoto")
	private String urlPhoto;
	
	@ManyToOne
	@JoinColumn(name = "id001UserStatus")
	private Parameter status;
	
	@Column(name = "copyDocument")
	private Boolean copyDocument;
	
	@Column(name = "promotion")
	private String promotion;
}
