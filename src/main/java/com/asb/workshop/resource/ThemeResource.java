package com.asb.workshop.resource;

import com.asb.workshop.model.Theme;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ThemeResource extends ResourceConverter<Theme, ThemeResource> {
	
	public Long idTheme;
	public String title;
	public String artist;
	public Long idThemeType;
	public String themeType;
	public String linkDrive;
	public String linkYoutube;
	public Long idAllowedRole;
	

	@Override
	public ThemeResource convert(Theme theme) 
	{
		return ThemeResource.builder()
				.idTheme(theme.getIdTheme())
				.title(theme.getTitle())
				.artist(theme.getArtist())
				.idThemeType(theme.getThemeType().getIdThemeType())
				.themeType(theme.getThemeType().getName())
				.linkDrive(theme.getLinkDrive())
				.linkYoutube(theme.getLinkYoutube())
				.idAllowedRole(theme.getAllowedRole().getIdRole())
				.build();
	}

}
