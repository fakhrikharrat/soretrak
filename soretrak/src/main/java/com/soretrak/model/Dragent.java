package com.soretrak.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="dragent_test")
@EntityListeners(AuditingEntityListener.class)



public class Dragent {
	
	@Id
	private Long matric;
	@NotBlank
	private String nom;
	@NotBlank
	private String prenom;
	@NotBlank
	private String situation;
	
	@Temporal(TemporalType.DATE)
	private Date datnais;
	
	
	
	
	public Dragent() {
		super();
	}
	
	
	
	public Dragent(Long matric, @NotBlank String nom, @NotBlank String prenom, @NotBlank String situation,
			Date datnais) {
		super();
		this.matric = matric;
		this.nom = nom;
		this.prenom = prenom;
		this.situation = situation;
		this.datnais = datnais;
	}



	public Long getMatric() {
		return matric;
	}
	public void setMatric(Long matric) {
		this.matric = matric;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getSituation() {
		return situation;
	}
	public void setSituation(String situation) {
		this.situation = situation;
	}
	public Date getDatnais() {
		return datnais;
	}
	public void setDatnais(Date datnais) {
		this.datnais = datnais;
	}
	
	
}
