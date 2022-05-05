package com.webdiamond.gestiondestock.dto;

import com.webdiamond.gestiondestock.model.Adresse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdresseDto {

    private Integer id;

    private String adresse1;

    private String adresse2;

    private String ville;

    private String codePostale;

    private String pays;

    public AdresseDto fromEntity(Adresse adresse){
        if(adresse == null){
            return null;
        }

        return AdresseDto.builder()
                .id(adresse.getId())
                .adresse1(adresse.getAdresse1())
                .adresse2(adresse.getAdresse2())
                .ville(adresse.getVille())
                .codePostale(adresse.getCodePostale())
                .pays(adresse.getPays())
                .build();
    }

    public Adresse toEntity(AdresseDto dto){
        if(dto == null){
            return null;
        }

        Adresse adresse = new Adresse();
        adresse.setId(dto.getId());
        adresse.setAdresse1(dto.getAdresse1());
        adresse.setAdresse2(dto.getAdresse2());
        adresse.setVille(dto.getVille());
        adresse.setCodePostale(dto.getCodePostale());
        adresse.setPays(dto.getPays());

        return adresse;
    }


}
