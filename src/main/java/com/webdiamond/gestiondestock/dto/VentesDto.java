package com.webdiamond.gestiondestock.dto;

import com.webdiamond.gestiondestock.model.LigneVente;

import javax.persistence.OneToMany;
import java.util.List;

public class VentesDto {

    private Integer id;

    private String code;

    private List<LigneVenteDto> ligneVentes;
}
