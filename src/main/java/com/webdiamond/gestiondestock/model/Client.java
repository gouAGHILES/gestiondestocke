package com.webdiamond.gestiondestock.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.*;


@Data
@Builder
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
	
	private String email;

	private String numTel;

	private Integer idEntreprise;
	
	@OneToMany(mappedBy = "client")
	private List<CommandeClient> commandeClients;


}
