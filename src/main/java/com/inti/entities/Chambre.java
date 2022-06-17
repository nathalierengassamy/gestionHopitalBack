package com.inti.entities;

import java.io.Serializable;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Chambre implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idChambre;
	private int numChambre;
	private int capacite;
	@ManyToOne()
	@JoinColumn(name = "id_dossier")
	private Dossier dossier;
	private Date dateEntree;
	private Date dateSortie;
	private boolean occupe = false;

	public Chambre() {

	}

	public Chambre(int numChambre, int capacite, Dossier dossier) {
		this.numChambre = numChambre;
		this.capacite = capacite;
		this.dossier = dossier;
	}

	public Chambre(int numChambre, int capacite, Dossier dossier, Date dateEntree, Date dateSortie) {
		this.numChambre = numChambre;
		this.capacite = capacite;
		this.dossier = dossier;
		this.dateEntree = dateEntree;
		this.dateSortie = dateSortie;
	}

	public Chambre(int numChambre, int capacite, Dossier dossier, Date dateEntree, Date dateSortie, boolean occupe) {
		this.numChambre = numChambre;
		this.capacite = capacite;
		this.dossier = dossier;
		this.dateEntree = dateEntree;
		this.dateSortie = dateSortie;
		this.occupe = occupe;
	}

	public Long getIdChambre() {
		return idChambre;
	}

	public void setIdChambre(Long idChambre) {
		this.idChambre = idChambre;
	}

	public int getNumChambre() {
		return numChambre;
	}

	public void setNumChambre(int numChambre) {
		this.numChambre = numChambre;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}

	public Date getDateEntree() {
		return dateEntree;
	}

	public void setDateEntree(Date dateEntree) {
		this.dateEntree = dateEntree;
	}

	public Date getDateSortie() {
		return dateSortie;
	}

	public void setDateSortie(Date dateSortie) {
		this.dateSortie = dateSortie;
	}

	public boolean isOccupe() {
		return occupe;
	}

	public void setOccupe(boolean occupe) {
		this.occupe = occupe;
	}
	
	public Dossier getDossier() {
		return dossier;
	}

	public void setDossier(Dossier dossier) {
		this.dossier = dossier;
	}

	@Override
	public String toString() {
		return "Chambre [idChambre=" + idChambre + ", numChambre=" + numChambre + ", capacite=" + capacite
				+ ", dossier=" + dossier + ", dateEntree=" + dateEntree + ", dateSortie=" + dateSortie + ", occupe="
				+ occupe + "]";
	}

}
