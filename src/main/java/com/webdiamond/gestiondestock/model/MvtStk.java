package com.webdiamond.gestiondestock.model;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.Date;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "mvtstk")
public class MvtStk extends AbstractEntity{

	private Instant dateMvt;

	private BigDecimal quantite;

	@ManyToOne
	@JoinColumn(name = "idArticle")
	private Article article;

	private TypeMvtStk  typeMvt;

}
