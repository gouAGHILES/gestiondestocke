package com.webdiamond.gestiondestock.dto;

import com.webdiamond.gestiondestock.model.Entreprise;
import com.webdiamond.gestiondestock.model.Roles;
import lombok.Builder;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Builder
public class UtilisateurDto {

    private Integer id;

    private String nom;

    private String prenom;

    private String mail;

    private String motDePasse;

    private String photo;

    private EntrepriseDto entreprise;

    List<RolesDto> roles;
}
