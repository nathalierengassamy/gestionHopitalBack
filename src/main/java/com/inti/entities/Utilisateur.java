
package com.inti.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.JoinColumn;

@Entity
public class Utilisateur implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUtilisateur;
	private String nomUtilisateur;
	private String prenomUtilisateur;
	@Column(unique = true)
	private String username;
	private String password;
	private Date dateNaissance;
	private String adresseUtilisateur;
	private int ageUtilisateur;
	private int telephone;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "PROFILS", joinColumns = @JoinColumn(name = "id_user", referencedColumnName = "idUtilisateur"), inverseJoinColumns = @JoinColumn(name = "id_role", referencedColumnName = "idRole"))
	private Set<Role> roles = new HashSet<>();
	@OneToOne(mappedBy = "user")
	private Dossier dossiers;
	@OneToMany(mappedBy = "user")
	private List<Medicament> medicaments = new ArrayList<>();
	@OneToMany(mappedBy = "user")
	private List<Message> messages = new ArrayList<>();
	@OneToMany(mappedBy = "user")
	private List<Ordonnace> ordonnances = new ArrayList<>();
	@OneToMany(mappedBy = "user")
	private List<rendezVous> rendezVous = new ArrayList<>();
	

	public Utilisateur() {
	}

	public Utilisateur(String nomUtilisateur, String prenomUtilisateur, Set<Role> roles) {
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.roles = roles;
	}
	
	public Utilisateur(String nomUtilisateur, String prenomUtilisateur, String username) {
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.username = username;
	}

	public Utilisateur(String nomUtilisateur, String prenomUtilisateur, String username, String password,
			Set<Role> roles) {
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.username = username;
		this.password = password;
		this.roles = roles;
	}
	
	public Utilisateur(String nomUtilisateur, String prenomUtilisateur, String username, Date dateNaissance,
			Set<Role> roles) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.username = username;
		this.dateNaissance = dateNaissance;
		this.roles = roles;
	}

	public Utilisateur(String nomUtilisateur, String prenomUtilisateur, String username, String password,
			Date dateNaissance, Set<Role> roles) {
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.username = username;
		this.password = password;
		this.dateNaissance = dateNaissance;
		this.roles = roles;
	}
	
	public Utilisateur(String nomUtilisateur, String prenomUtilisateur, String username, String password,
			Date dateNaissance, String adresseUtilisateur, int ageUtilisateur, int telephone, Set<Role> roles,
			Dossier dossiers, List<Medicament> medicaments, List<Message> messages, List<Ordonnace> ordonnances,
			List<rendezVous> rendezVous) {
		super();
		this.nomUtilisateur = nomUtilisateur;
		this.prenomUtilisateur = prenomUtilisateur;
		this.username = username;
		this.password = password;
		this.dateNaissance = dateNaissance;
		this.adresseUtilisateur = adresseUtilisateur;
		this.ageUtilisateur = ageUtilisateur;
		this.telephone = telephone;
		this.roles = roles;
		this.dossiers = dossiers;
		this.medicaments = medicaments;
		this.messages = messages;
		this.ordonnances = ordonnances;
		this.rendezVous = rendezVous;
	}

	public Long getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNomUtilisateur() {
		return nomUtilisateur;
	}

	public void setNomUtilisateur(String nomUtilisateur) {
		this.nomUtilisateur = nomUtilisateur;
	}

	public String getPrenomUtilisateur() {
		return prenomUtilisateur;
	}

	public void setPrenomUtilisateur(String prenomUtilisateur) {
		this.prenomUtilisateur = prenomUtilisateur;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	public String getAdresseUtilisateur() {
		return adresseUtilisateur;
	}

	public void setAdresseUtilisateur(String adresseUtilisateur) {
		this.adresseUtilisateur = adresseUtilisateur;
	}

	public int getAgeUtilisateur() {
		return ageUtilisateur;
	}

	public void setAgeUtilisateur(int ageUtilisateur) {
		this.ageUtilisateur = ageUtilisateur;
	}

	public int getTelephone() {
		return telephone;
	}

	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}

	public Dossier getDossiers() {
		return dossiers;
	}

	public void setDossiers(Dossier dossiers) {
		this.dossiers = dossiers;
	}

	public List<Medicament> getMedicaments() {
		return medicaments;
	}

	public void setMedicaments(List<Medicament> medicaments) {
		this.medicaments = medicaments;
	}

	public List<Message> getMessages() {
		return messages;
	}

	public void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public List<Ordonnace> getOrdonnances() {
		return ordonnances;
	}

	public void setOrdonnances(List<Ordonnace> ordonnances) {
		this.ordonnances = ordonnances;
	}

	public List<rendezVous> getRendezVous() {
		return rendezVous;
	}

	public void setRendezVous(List<rendezVous> rendezVous) {
		this.rendezVous = rendezVous;
	}

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", nomUtilisateur=" + nomUtilisateur
				+ ", prenomUtilisateur=" + prenomUtilisateur + ", username=" + username + ", password=" + password
				+ ", dateNaissance=" + dateNaissance + ", adresseUtilisateur=" + adresseUtilisateur
				+ ", ageUtilisateur=" + ageUtilisateur + ", telephone=" + telephone + ", roles=" + roles + "]";
	}
	
}
