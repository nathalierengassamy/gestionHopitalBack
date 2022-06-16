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
public class RDV implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRDV;
	private String heureRDV;
	private Date dateRDV;
	private String diagnostic;
	@ManyToOne
	private Utilisateur user;
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "rdvs", joinColumns = @JoinColumn(name = "id_rdv", referencedColumnName = "idRDV"), inverseJoinColumns = @JoinColumn(name = "id_typerdv", referencedColumnName = "idTypeRDV"))
	private Set<TypeRDV> typeRDVs = new HashSet<>();

	public RDV() {

	}
	
	public RDV(String heureRDV, Date dateRDV, String diagnostic, Utilisateur user, Set<TypeRDV> typeRDVs) {
		super();
		this.heureRDV = heureRDV;
		this.dateRDV = dateRDV;
		this.diagnostic = diagnostic;
		this.user = user;
		this.typeRDVs = typeRDVs;
	}

	public Long getIdRDV() {
		return idRDV;
	}

	public void setIdRDV(Long idRDV) {
		this.idRDV = idRDV;
	}
	
	public Set<TypeRDV> getTypeRDVs() {
		return typeRDVs;
	}

	public void setTypeRDVs(Set<TypeRDV> typeRDVs) {
		this.typeRDVs = typeRDVs;
	}

	public String getHeureRDV() {
		return heureRDV;
	}

	public void setHeureRDV(String heureRDV) {
		this.heureRDV = heureRDV;
	}

	public Date getDateRDV() {
		return dateRDV;
	}

	public void setDateRDV(Date dateRDV) {
		this.dateRDV = dateRDV;
	}

	public String getDiagnostic() {
		return diagnostic;
	}

	public void setDiagnostic(String diagnostic) {
		this.diagnostic = diagnostic;
	}

	public Utilisateur getUser() {
		return user;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "RDV [idRDV=" + idRDV + ", heureRDV=" + heureRDV + ", dateRDV=" + dateRDV + ", diagnostic=" + diagnostic
				+ ", typeRDVs=" + typeRDVs + "]";
	}
	
}
