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
@Table(name="articles_groups")
@Entity
public class ArticleGroup {

	@Id
	@Column(name = "idArticleGroup")
	private Long idArticleGroup;
	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "idMark")
	private Mark mark;
	
	@ManyToOne
	@JoinColumn(name = "id009QualityType")
	private Parameter qualityType;
	
	@ManyToOne
	@JoinColumn(name = "idOrigin")
	private Origin origin;
	
	@Column(name = "year")
	private String year;
}
