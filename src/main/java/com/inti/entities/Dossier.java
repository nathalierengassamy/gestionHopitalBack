package com.inti.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Column;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity
public class Dossier implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idDossier;
	@OneToMany(mappedBy = "dossier")
	private List<Facture> factures = new ArrayList<>();
	@OneToMany(mappedBy = "dossier")
	private List<Ordonnance> ordonnances = new ArrayList<>();
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "Localisation", joinColumns = @JoinColumn(name = "id_dossier", referencedColumnName = "idDossier"), inverseJoinColumns = @JoinColumn(name = "id_chambre", referencedColumnName = "idChambre"))
	private Set<Chambre> chambres = new HashSet<>();
	@OneToOne
	private Utilisateur user;

	public Dossier() {
		// TODO Auto-generated constructor stub
	}

	public Dossier(List<Facture> factures, List<Ordonnance> ordonnances, Set<Chambre> chambres) {
		this.factures = factures;
		this.ordonnances = ordonnances;
		this.chambres = chambres;
	}
	
	public Dossier(List<Facture> factures, List<Ordonnance> ordonnances, Set<Chambre> chambres,
			Utilisateur user) {
		super();
		this.factures = factures;
		this.ordonnances = ordonnances;
		this.chambres = chambres;
		this.user = user;
	}

	public Long getIdDossier() {
		return idDossier;
	}

	public void setIdDossier(Long idDossier) {
		this.idDossier = idDossier;
	}

	public List<Facture> getFactures() {
		return factures;
	}

	public void setFactures(List<Facture> factures) {
		this.factures = factures;
	}

	public List<Ordonnance> getOrdonnances() {
		return ordonnances;
	}

	public void setOrdonnances(List<Ordonnance> ordonnances) {
		this.ordonnances = ordonnances;
	}

	public Set<Chambre> getChambres() {
		return chambres;
	}

	public void setChambres(Set<Chambre> chambres) {
		this.chambres = chambres;
	}
	
	public Utilisateur getUtilisateur() {
		return user;
	}

	public void setUtilisateur(Utilisateur user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Dossier [idDossier=" + idDossier + ", factures=" + factures + "]";
	}

}
