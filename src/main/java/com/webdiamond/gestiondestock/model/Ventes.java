package com.webdiamond.gestiondestock.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vente")
public class Ventes extends AbstractEntity{
	
	private String code;

	private Integer idEntreprise;

	@OneToMany(mappedBy = "ventes")
	private List<LigneVente> ligneVentes;
	
}
