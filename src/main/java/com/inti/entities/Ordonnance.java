package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Ordonnance implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOrdonnance;
	private String Consigne;
	private String Medicament;
	
	@ManyToOne
	@JoinColumn(name="id_dossier")
	private Dossier dossier;

	public Ordonnance() {
	}

	public Ordonnance(String consigne, String medicament, Dossier dossier) {
		this.Consigne = consigne;
		this.Medicament = medicament;
		this.dossier = dossier;
	}

	public Long getIdOrdonnance() {
		return idOrdonnance;
	}

	public void setIdOrdonnance(Long idOrdonnance) {
		this.idOrdonnance = idOrdonnance;
	}

	public String getConsigne() {
		return Consigne;
	}

	public void setConsigne(String consigne) {
		Consigne = consigne;
	}

	public String getMedicament() {
		return Medicament;
	}

	public void setMedicament(String medicament) {
		Medicament = medicament;
	}

	public Dossier getDossier() {
		return dossier;
	}

	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}

	@Override
	public String toString() {
		return "Ordonnance [idOrdonnance=" + idOrdonnance + ", Consigne=" + Consigne + ", Medicament=" + Medicament
				+ "]";
	}
	
}

