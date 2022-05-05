package com.webdiamond.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.webdiamond.gestiondestock.model.Adresse;
import com.webdiamond.gestiondestock.model.Client;
import com.webdiamond.gestiondestock.model.CommandeFournisseur;
import com.webdiamond.gestiondestock.model.Fournisseur;
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

    private String email;

    private String numTel;

    @JsonIgnore
    private List<CommandeFournisseurDto> commandeFournisseurs;

    public FournisseurDto fromEntity(Fournisseur fournisseur){
        if(fournisseur == null){
            return null;
        }

        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .nom(fournisseur.getNom())
                .prenom(fournisseur.getPrenom())
                .photo(fournisseur.getPhoto())
                .numTel(fournisseur.getNumTel())
                .email(fournisseur.getEmail())
                .build();
    }

    public Fournisseur toEntity(FournisseurDto dto){
        if(dto == null){
            return null;
        }

        Fournisseur fournisseur = new Fournisseur();
        fournisseur.setId(dto.getId());
        fournisseur.setNom(dto.getNom());
        fournisseur.setPrenom(dto.getPrenom());
        fournisseur.setPhoto(dto.getPhoto());
        fournisseur.setNumTel(dto.getNumTel());
        fournisseur.setEmail(dto.getEmail());

        return fournisseur;
    }
}
