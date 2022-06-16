package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TypeRDV implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idTypeRDV;
	private String libelle;
	
	public TypeRDV() {
		
	}

	public TypeRDV(String libelle) {
		this.libelle = libelle;
	}

	public Long getIdTypeRDV() {
		return idTypeRDV;
	}

	public void setIdTypeRDV(Long idTypeRDV) {
		this.idTypeRDV = idTypeRDV;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "typeRDV [idTypeRDV=" + idTypeRDV + ", libelle=" + libelle + "]";
	}
	
}
