package com.webdiamond.gestiondestock.validator;

import com.webdiamond.gestiondestock.dto.ArticleDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticleValidate {

    public static List<String> validate(ArticleDto articleDto){
        List<String> errors = new ArrayList<>();

        if(articleDto == null){
            errors.add("Vuillez renseigner le code d'article");
            errors.add("Vuillez renseigner la designation d'article");
            errors.add("Vuillez renseigner le prix unitaire ht d'article");
            errors.add("Vuillez renseigner le prix unitaire ttc d'article");
            errors.add("Vuillez renseigner le taux de tva d'article");
            errors.add("Vuillez renseigner la catégorie d'article");
            return errors;
        }

        if (StringUtils.hasLength(articleDto.getCodeArticle())){
            errors.add("Vuillez renseigner le code d'article");
        }
        if (StringUtils.hasLength(articleDto.getDesignation())){
            errors.add("Vuillez renseigner la designation d'article");
        }
        if (articleDto.getPrixUnitaireHT() ==null){
            errors.add("Vuillez renseigner le prix unitaire ht d'article");
        }
        if (articleDto.getPrixUnitaireTTC() ==null){
            errors.add("Vuillez renseigner le prix unitaire ttc d'article");
        }
        if (articleDto.getTauxTva() ==null){
            errors.add("Vuillez renseigner le taux de tva d'article");
        }
        if (articleDto.getCategory() == null){
            errors.add("Vuillez renseigner la catégorie d'article");
        }


        return errors;
    }
}
