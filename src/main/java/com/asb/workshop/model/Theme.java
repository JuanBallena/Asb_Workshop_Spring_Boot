package com.asb.workshop.model;

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
@Table(name="themes")
@Entity
public class Theme {
	
	public static final String FIELD_ALLOWED_ROLE = "allowedRole";

	@Id
	@Column(name = "idTheme")
	private Long idTheme;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "artist")
	private String artist;
	
	@ManyToOne
	@JoinColumn(name = "idThemeType")
	private ThemeType themeType;
	
	@Column(name = "linkDrive")
	private String linkDrive;
	
	@Column(name = "linkYoutube")
	private String linkYoutube;
	
	@ManyToOne
	@JoinColumn(name = "idAllowedRole")
	private Role allowedRole;
}
