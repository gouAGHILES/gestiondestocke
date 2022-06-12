package com.webdiamond.gestiondestock.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Roles extends AbstractEntity{

	private String roleName;

	private Integer idEntreprise;

	@OneToMany(mappedBy = "roles")
	private List<Utilisateur> utilisateur;

}
