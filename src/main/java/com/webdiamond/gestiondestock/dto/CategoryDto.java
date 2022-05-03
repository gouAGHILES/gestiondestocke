package com.webdiamond.gestiondestock.dto;

import com.webdiamond.gestiondestock.model.Article;
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

    private List<ArticleDto> articles;

}
