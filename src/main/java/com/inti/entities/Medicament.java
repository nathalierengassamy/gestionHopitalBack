package com.inti.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Medicament implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMedicament;
	private String libelleMedicament;
	private int prixMedicament;
	private Date dateExpiration;
	private double stock;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "Med", joinColumns = @JoinColumn(name = "id_med", 
	referencedColumnName = "idMedicament"), 
	inverseJoinColumns = @JoinColumn(name = "id_ordonnance", referencedColumnName = "idOrdonnance"))
	private Set<Ordonnance> ordonnances = new HashSet<>();
	
	@ManyToOne
	@JoinColumn(name="id_user")
	private Utilisateur utilisateur;

	public Medicament() {
	}

	public Medicament(String libelleMedicament, int prixMedicament, Date dateExpiration, double stock,
			Set<Ordonnance> ordonnances, Utilisateur utilisateur) {
		this.libelleMedicament = libelleMedicament;
		this.prixMedicament = prixMedicament;
		this.dateExpiration = dateExpiration;
		this.stock = stock;
		this.ordonnances = ordonnances;
		this.utilisateur = utilisateur;
	}

	public Long getIdMedicament() {
		return idMedicament;
	}

	public void setIdMedicament(Long idMedicament) {
		this.idMedicament = idMedicament;
	}

	public String getLibelleMedicament() {
		return libelleMedicament;
	}

	public void setLibelleMedicament(String libelleMedicament) {
		this.libelleMedicament = libelleMedicament;
	}

	public int getPrixMedicament() {
		return prixMedicament;
	}

	public void setPrixMedicament(int prixMedicament) {
		this.prixMedicament = prixMedicament;
	}

	public Date getDateExpiration() {
		return dateExpiration;
	}

	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}

	public double getStock() {
		return stock;
	}

	public void setStock(double stock) {
		this.stock = stock;
	}

	public Set<Ordonnance> getOrdonnances() {
		return ordonnances;
	}

	public void setOrdonnances(Set<Ordonnance> ordonnances) {
		this.ordonnances = ordonnances;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Override
	public String toString() {
		return "Medicament [idMedicament=" + idMedicament + ", libelleMedicament=" + libelleMedicament
				+ ", prixMedicament=" + prixMedicament + ", dateExpiration=" + dateExpiration + ", stock=" + stock
				+ ", ordonnances=" + ordonnances + ", utilisateur=" + utilisateur + "]";
	}
	
}