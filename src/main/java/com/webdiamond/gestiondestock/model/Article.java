package com.webdiamond.gestiondestock.model;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "article")
public class Article extends AbstractEntity{

	private String codeArticle;
	
	private String designation;
	
	private BigDecimal prixUnitaireHT;

	private Integer idEntreprise;
	
	private BigDecimal tauxTva;
	
	private BigDecimal prixUnitaireTTC;
	
	private String photo;
	
	@ManyToOne
	@JoinColumn(name = "idcategory")
	private Category category;

}
