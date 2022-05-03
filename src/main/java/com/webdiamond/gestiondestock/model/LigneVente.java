package com.webdiamond.gestiondestock.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "lignevente")
public class LigneVente extends AbstractEntity{
	
	@ManyToOne
	@JoinColumn(name = "vente")
	private Ventes vente;

	private BigDecimal quantite;

	private BigDecimal prixUnitaire;
	
}
