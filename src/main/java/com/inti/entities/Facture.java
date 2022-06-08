package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
public class Facture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idFacture;
	private double montant;
	private String destinataire;
	@ManyToOne()
	@JoinColumn(name = "id_dossier")
	private Dossier dossier;

	public Facture() {
		// TODO Auto-generated constructor stub
	}

	public Facture(double montant, String destinataire, Dossier dossier) {
		this.montant = montant;
		this.destinataire = destinataire;
		this.dossier = dossier;
	}

	public Long getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getDestinataire() {
		return destinataire;
	}

	public void setDestinataire(String destinataire) {
		this.destinataire = destinataire;
	}

	public Dossier getDossierFacture() {
		return dossier;
	}

	public void setDossierFacture(Dossier dossier) {
		this.dossier = dossier;
	}

	@Override
	public String toString() {
		return "Facture [idFacture=" + idFacture + ", montant=" + montant + ", destinataire=" + destinataire
				+ ", dossier=" + dossier + "]";
	}

}
