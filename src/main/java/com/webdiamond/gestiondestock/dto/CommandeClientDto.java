package com.webdiamond.gestiondestock.dto;

import com.webdiamond.gestiondestock.model.Client;
import com.webdiamond.gestiondestock.model.CommandeClient;
import com.webdiamond.gestiondestock.model.LigneCommandeClient;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Data
@Builder
public class CommandeClientDto {

    private Integer id;

    private String code;

    private Date dateCommande;

    private ClientDto client;

    private List<LigneCommandeClientDto> ligneCommandeClients;

    public CommandeClientDto fromEntity(CommandeClient commandeClient){
        if(commandeClient == null){
            return null;
        }

        return CommandeClientDto.builder()
                .id(commandeClient.getId())
                .code(commandeClient.getCode())
                .dateCommande(commandeClient.getDateCommande())
                .build();
    }

    public CommandeClient toEntity(CommandeClientDto dto){
        if(dto == null){
            return null;
        }

        CommandeClient commandeClient = new CommandeClient();
        commandeClient.setId(dto.getId());
        commandeClient.setCode(dto.getCode());
        commandeClient.setDateCommande(dto.getDateCommande());

        return commandeClient;
    }
}
