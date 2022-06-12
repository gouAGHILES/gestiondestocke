package com.webdiamond.gestiondestock.validator;

import com.webdiamond.gestiondestock.dto.UtilisateurDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class UtilisateurValidator {

    public static List<String> validate(UtilisateurDto utilisateurDto){
        List<String> errors = new ArrayList<>();

        if(utilisateurDto == null){
            errors.add("Vuillez renseigner le nom de l'utilisateur");
            errors.add("Vuillez renseigner le prenom de l'utilisateur");
            errors.add("Vuillez renseigner le mail de l'utilisateur");
            errors.add("Vuillez renseigner le mot de passe de l'utilisateur");
            errors.add("Veuillez renseigner l'adresse de l'utilisateur");
            return errors;
        }

        if(StringUtils.hasLength(utilisateurDto.getNom())){
            errors.add("Vuillez renseigner le nom de l'utilisateur");
        }
        if(StringUtils.hasLength(utilisateurDto.getPrenom())){
            errors.add("Vuillez renseigner le prenom de l'utilisateur");
        }
        if(StringUtils.hasLength(utilisateurDto.getEmail())){
            errors.add("Vuillez renseigner le mail de l'utilisateur");
        }
        if(StringUtils.hasLength(utilisateurDto.getMotDePasse())){
            errors.add("Vuillez renseigner le mot de passe de l'utilisateur");
        }
        if(utilisateurDto.getAdresseDto()  == null){
            errors.add("Veuillez renseigner l'adresse de l'utilisateur");
        }else{
            if(StringUtils.hasLength(utilisateurDto.getAdresseDto().getAdresse1())){
                errors.add("Le champs 'adresse 1' est obligatoire");
            }
            if(StringUtils.hasLength(utilisateurDto.getAdresseDto().getVille())){
                errors.add("Le champs 'ville' est obligatoire");
            }
            if(StringUtils.hasLength(utilisateurDto.getAdresseDto().getCodePostale())){
                errors.add("Le champs 'code postale' est obligatoire");
            }
            if(StringUtils.hasLength(utilisateurDto.getAdresseDto().getPays())){
                errors.add("Le champs 'pays' est obligatoire");
            }
        }
        return errors;
    }
}
