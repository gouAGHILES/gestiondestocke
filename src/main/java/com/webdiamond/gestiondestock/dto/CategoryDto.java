package com.webdiamond.gestiondestock.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.webdiamond.gestiondestock.model.Article;
import com.webdiamond.gestiondestock.model.Category;
import lombok.Builder;
import lombok.Data;

import javax.persistence.OneToMany;
import java.util.List;

@Data
@Builder
public class CategoryDto {

    private Integer id;

    private String code;

    private String designation;

    @JsonIgnore
    private List<ArticleDto> articles;

    public  CategoryDto fromEntity(Category category){
        if(category == null){
            return null;
            //TODO throw an exception
        }

        return CategoryDto.builder()
                .id(category.getId())
                .code(category.getCode())
                .designation(category.getDesignation())
                .build();
    }

    public Category toEntity(CategoryDto dto){
        if(dto == null){
            return null;
            //TODO throw an exception
        }

        Category category = new Category();
        category.setId(dto.getId());
        category.setCode(dto.getCode());
        category.setDesignation(dto.getDesignation());
        return category;
    }

}
