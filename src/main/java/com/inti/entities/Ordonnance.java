package com.inti.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ordonnance implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOrdonnance;
	private String Consigne;
	private String Medicament;
	@ManyToOne
	@JoinColumn(name = "id_dossier")
	private Dossier dossier;
	@ManyToOne
	@JoinColumn(name = "id_user")
	private Utilisateur user;

	public Ordonnance() {
	}

	public Ordonnance(String consigne, String medicament, Dossier dossier) {
		this.Consigne = consigne;
		this.Medicament = medicament;
		this.dossier = dossier;
	}

	public Ordonnance(String consigne, String medicament, Dossier dossier, Utilisateur user) {
		this.Consigne = consigne;
		this.Medicament = medicament;
		this.dossier = dossier;
		this.user = user;
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

	public Utilisateur getUser() {
		return user;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Ordonnance [idOrdonnance=" + idOrdonnance + ", Consigne=" + Consigne + ", Medicament=" + Medicament
				+ "]";
	}

}
