package com.webdiamond.gestiondestock.dto;

import com.webdiamond.gestiondestock.model.Adresse;
import com.webdiamond.gestiondestock.model.CommandeClient;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Embedded;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@Builder
public class ClientDto {

    private Integer id;

    private String nom;

    private String prenom;

    @Embedded
    private Adresse adresse;

    private String photo;

    private String mail;

    private String numTel;

    private List<CommandeClientDto> commandeClients;
}
