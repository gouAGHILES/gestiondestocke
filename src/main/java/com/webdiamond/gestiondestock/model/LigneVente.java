package com.webdiamond.gestiondestock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
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
	
}
