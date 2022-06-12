package com.webdiamond.gestiondestock.validator;

import com.webdiamond.gestiondestock.dto.ClientDto;
import com.webdiamond.gestiondestock.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ClientValidatate {
    public static List<String> validate(ClientDto clientDto){
        List<String> errors = new ArrayList<>();

        if(clientDto == null){
            errors.add("Vuillez renseigner le nom de client");
            errors.add("Vuillez renseigner le prenom de client");
            errors.add("Vuillez renseigner le mail de client");
            errors.add("Vuillez renseigner le numéro de télépgone de client");
            return errors;
        }

        if(StringUtils.hasLength(clientDto.getNom())){
            errors.add("Vuillez renseigner le nom de client");
        }
        if(StringUtils.hasLength(clientDto.getPrenom())){
            errors.add("Vuillez renseigner le prenom de client");
        }
        if(StringUtils.hasLength(clientDto.getEmail())){
            errors.add("Vuillez renseigner le mail de client");
        }
        if(StringUtils.hasLength(clientDto.getNumTel())){
            errors.add("Vuillez renseigner le numéro de télépgone de client");
        }


        return errors;
    }
}
