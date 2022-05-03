package com.webdiamond.gestiondestock.dto;

import com.webdiamond.gestiondestock.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@Builder
public class RolesDto {

    private Integer id;

    private String roleName;

    private Utilisateur utilisateur;
}
