package com.webdiamond.gestiondestock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "vente")
public class Ventes extends AbstractEntity{
	
	private String code;
	
	@OneToMany(mappedBy = "vente")
	private List<LigneVente> ligneVentes;
	
}
