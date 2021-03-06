package com.webdiamond.gestiondestock.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Data
@Builder
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity{
	
	private String nom;
	
	private String prenom;
	
	private String email;


	@Embedded
	private Adresse adresse;
	
	private String motDePasse;
	
	private String photo;

	@ManyToOne
	@JoinColumn(name = "identreprise")
	private Entreprise entreprise;

	@ManyToOne
	@JoinColumn(name = "idroles")
	private Roles roles;


}
