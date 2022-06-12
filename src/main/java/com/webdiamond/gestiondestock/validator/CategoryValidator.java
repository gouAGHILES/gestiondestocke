package com.webdiamond.gestiondestock.validator;

import com.webdiamond.gestiondestock.dto.CategoryDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class CategoryValidator {

    public static List<String> validate(CategoryDto categoryDto){
        List<String> errors = new ArrayList<>();


        if(categoryDto == null || !StringUtils.hasLength(categoryDto.getCode())){

            errors.add("Veuiller renseigner le code de la category");

        }
        return errors;
    }
}
