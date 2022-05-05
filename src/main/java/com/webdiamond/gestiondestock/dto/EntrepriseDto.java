package com.webdiamond.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.webdiamond.gestiondestock.model.Adresse;
import com.webdiamond.gestiondestock.model.Client;
import com.webdiamond.gestiondestock.model.Entreprise;
import com.webdiamond.gestiondestock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Builder
public class EntrepriseDto {

    private Integer id;

    private String nom;

    private String description;

    @JsonIgnore
    private AdresseDto adresse;

    private String photo;

    private String email;

    private String numTel;

    private String siteWeb;

    @JsonIgnore
    private List<UtilisateurDto> utilisateurs;

    public EntrepriseDto fromEntity(Entreprise entreprise){
        if(entreprise == null){
            return null;
        }

        return EntrepriseDto.builder()
                .id(entreprise.getId())
                .nom(entreprise.getNom())
                .description(entreprise.getDescription())
                .photo(entreprise.getPhoto())
                .numTel(entreprise.getNumTel())
                .email(entreprise.getEmail())
                .siteWeb(entreprise.getSiteWeb())
                .build();
    }

    public Entreprise toEntity(EntrepriseDto dto){
        if(dto == null){
            return null;
        }

        Entreprise entreprise = new Entreprise();
        entreprise.setId(dto.getId());
        entreprise.setNom(dto.getNom());
        entreprise.setDescription(dto.getDescription());
        entreprise.setPhoto(dto.getPhoto());
        entreprise.setNumTel(dto.getNumTel());
        entreprise.setEmail(dto.getEmail());
        entreprise.setSiteWeb(dto.getSiteWeb());

        return entreprise;
    }
}
