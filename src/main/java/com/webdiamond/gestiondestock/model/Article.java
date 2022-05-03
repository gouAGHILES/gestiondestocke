package com.webdiamond.gestiondestock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "article")
public class Article extends AbstractEntity{

	private String codeArticle;
	
	private String designation;
	
	private BigDecimal prixUnitaireHT;
	
	private BigDecimal tauxTva;
	
	private BigDecimal prixUnitaireTTC;
	
	private String photo;
	
	@ManyToOne
	@JoinColumn(name = "idcategory")
	private Category category;

}
