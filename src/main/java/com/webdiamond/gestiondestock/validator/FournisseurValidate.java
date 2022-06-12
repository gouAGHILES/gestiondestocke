package com.webdiamond.gestiondestock.validator;

import com.webdiamond.gestiondestock.dto.ClientDto;
import com.webdiamond.gestiondestock.dto.FournisseurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class FournisseurValidate {

    public static List<String> validate(FournisseurDto fournisseurDto){

            List<String> errors = new ArrayList<>();

            if(fournisseurDto == null){
                errors.add("Vuillez renseigner le nom de fournisseur");
                errors.add("Vuillez renseigner le prenom de fournisseur");
                errors.add("Vuillez renseigner le mail de fournisseur");
                errors.add("Vuillez renseigner le numéro de télépgone de fournisseur");
                return errors;
            }

            if(StringUtils.hasLength(fournisseurDto.getNom())){
                errors.add("Vuillez renseigner le nom de fournisseur");
            }
            if(StringUtils.hasLength(fournisseurDto.getPrenom())){
                errors.add("Vuillez renseigner le prenom de fournisseur");
            }
            if(StringUtils.hasLength(fournisseurDto.getEmail())){
                errors.add("Vuillez renseigner le mail de fournisseur");
            }
            if(StringUtils.hasLength(fournisseurDto.getNumTel())){
                errors.add("Vuillez renseigner le numéro de télépgone de fournisseur");
            }


            return errors;
        }

}
