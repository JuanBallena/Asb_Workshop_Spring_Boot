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
@Table(name="articles_groups_details_complements")
@Entity
public class ArticleGroupDetailComplement {

	@Id
	@Column(name = "idArticleGroupDetailComplement")
	private Long idArticleGroupDetailComplement;
	
	@ManyToOne
	@JoinColumn(name = "idArticleGroupDetail")
	private ArticleGroupDetail articleGroupDetail;
	
	@ManyToOne
	@JoinColumn(name = "idComplement")
	private Complement complement;
}
