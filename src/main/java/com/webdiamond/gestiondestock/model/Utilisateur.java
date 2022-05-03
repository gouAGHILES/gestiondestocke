package com.webdiamond.gestiondestock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

@Data
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "utilisateur")
public class Utilisateur extends AbstractEntity{
	
	private String nom;
	
	private String prenom;
	
	private String mail;
	
	private String motDePasse;
	
	private String photo;
	
	private boolean actived;
	
	@OneToMany(mappedBy = "utilisateur")
	List<Roles> roles;


}
