package com.webdiamond.gestiondestock.dto;

import com.webdiamond.gestiondestock.model.Ventes;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDto {

    private Integer id;

    private Ventes vente;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;

}
