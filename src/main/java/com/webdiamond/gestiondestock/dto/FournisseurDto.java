package com.webdiamond.gestiondestock.dto;

import com.webdiamond.gestiondestock.model.Adresse;
import com.webdiamond.gestiondestock.model.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Builder
public class FournisseurDto {

    private Integer id;

    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String photo;

    private String mail;

    private String numTel;

    private List<CommandeFournisseurDto> commandeFournisseurs;
}
