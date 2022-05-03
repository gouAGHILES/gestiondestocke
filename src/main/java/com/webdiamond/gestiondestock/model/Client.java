package com.webdiamond.gestiondestock.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "client")
public class Client extends AbstractEntity{

	private String nom;
	
	private String prenom;

	@Embedded
	private Adresse adresse;
	
	private String photo;
	
	private String mail;

	private String numTel;
	
	@OneToMany(mappedBy = "client")
	private List<CommandeClient> commandeClients;


}