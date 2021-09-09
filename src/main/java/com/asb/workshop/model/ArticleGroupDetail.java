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
@Table(name="articles_groups_details")
@Entity
public class ArticleGroupDetail {

	@Id
	@Column(name = "idArticleGroupDetail")
	private Long idArticleGroupDetail;
	
	@ManyToOne
	@JoinColumn(name = "idArticleGroup")
	private ArticleGroup articleGroup;
	
	@Column(name = "code")
	private String code;
	
	@Column(name = "features")
	private String features;
	
	@ManyToOne
	@JoinColumn(name = "idColor")
	private Color color;
	
	@ManyToOne
	@JoinColumn(name = "id010ArticleStatus")
	private Parameter articleStatus;
	
	@Column(name = "available")
	private Boolean available;
}
