package com.webdiamond.gestiondestock.dto;

import com.webdiamond.gestiondestock.model.LigneVente;
import com.webdiamond.gestiondestock.model.Ventes;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class VentesDto {

    private Integer id;

    private String code;

    private List<LigneVenteDto> ligneVentes;

    public VentesDto fromEntity(Ventes ventes){
        if(ventes == null){
            return null;
        }

        return VentesDto.builder()
                .id(ventes.getId())
                .code(ventes.getCode())
                .build();
    }

    public Ventes toEntity(VentesDto dto){
        if(dto == null){
            return null;
        }

        Ventes ventes = new Ventes();
        ventes.setId(dto.getId());
        ventes.setCode(dto.getCode());

        return  ventes;
    }
}
