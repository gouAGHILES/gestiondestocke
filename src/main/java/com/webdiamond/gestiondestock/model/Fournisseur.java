package com.webdiamond.gestiondestock.model;

import lombok.*;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "fournisseur")
public class Fournisseur extends AbstractEntity{
	
	private String nom;
	
	private String prenom;

	@Embedded
	private Adresse adresse;
	
	private String photo;
	
	private String mail;

	private String numTel;
	
	@OneToMany(mappedBy = "fournisseur")
	private List<CommandeFournisseur> commandeFournisseurs;


}
