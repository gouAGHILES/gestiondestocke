package com.webdiamond.gestiondestock.model;

import lombok.*;

import java.math.BigDecimal;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "lignecommandefournisseur")
public class LigneVente extends AbstractEntity{

	
	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "idCommandeFournisseur")
	private CommandeFournisseur commandeFournisseur;

	@ManyToOne
	@JoinColumn(name = "idventes")
	private Ventes ventes;

	private BigDecimal quantite;

	private BigDecimal prixUnitaire;

	private Integer idEntreprise;
	
	
}
