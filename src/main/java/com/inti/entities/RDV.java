package com.inti.entities;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class RDV {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idRDV;
	private String typeRDV;
	private String heureRDV;
	private Date dateRDV;
	private String diagnostic;
	@ManyToOne
	private Utilisateur user;

	public RDV() {

	}

	public RDV(String typeRDV, String heureRDV, Date dateRDV, String diagnostic, Utilisateur user) {
		this.typeRDV = typeRDV;
		this.heureRDV = heureRDV;
		this.dateRDV = dateRDV;
		this.diagnostic = diagnostic;
		this.user = user;
	}

	public Long getIdRDV() {
		return idRDV;
	}

	public void setIdRDV(Long idRDV) {
		this.idRDV = idRDV;
	}

	public String getTypeRDV() {
		return typeRDV;
	}

	public void setTypeRDV(String typeRDV) {
		this.typeRDV = typeRDV;
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

	public Utilisateur getUtilisateur() {
		return user;
	}

	public void setUtilisateur(Utilisateur user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "RDV [idRDV=" + idRDV + ", typeRDV=" + typeRDV + ", heureRDV=" + heureRDV + ", dateRDV=" + dateRDV
				+ ", diagnostic=" + diagnostic + ", user=" + user + "]";
	}

}
