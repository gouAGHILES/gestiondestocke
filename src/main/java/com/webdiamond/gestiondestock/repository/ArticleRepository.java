package com.webdiamond.gestiondestock.repository;

import com.webdiamond.gestiondestock.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Integer, Article> {


    Article findByCodeArticle(String codeArticle);

    @Query("select a from article where codearticle = :code and designation = :designation")
    List<Article> findByCustomQuery(String code, String Designation);


}
