package com.webdiamond.gestiondestock.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.*;


@Data
@Builder
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Entity
@Table(name = "category")
public class Category extends AbstractEntity{
	
	private String code;
	
	private String designation;
	
	@OneToMany(mappedBy = "category")
	private List<Article> articles;

}
