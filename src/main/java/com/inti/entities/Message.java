package com.inti.entities;

import java.io.Serializable;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Message implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idMessage;
	private Date dateMessage;
	private String libelle;
	@ManyToOne
	@JoinColumn(name = "id_user")
	private Utilisateur user;

	public Message() {
	}

	public Message(String libelle, Utilisateur user) {
		this.libelle = libelle;
		this.user = user;
	}
	
	public Message(Date dateMessage, String libelle, Utilisateur user) {
		this.dateMessage = dateMessage;
		this.libelle = libelle;
		this.user = user;
	}

	public Long getIdMessage() {
		return idMessage;
	}

	public void setIdMessage(Long idMessage) {
		this.idMessage = idMessage;
	}

	public Date getDateMessage() {
		return dateMessage;
	}

	public void setDateMessage(Date dateMessage) {
		this.dateMessage = dateMessage;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Utilisateur getUser() {
		return user;
	}

	public void setUser(Utilisateur user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Message [idMessage=" + idMessage + ", dateMessage=" + dateMessage + ", libelle=" + libelle + "]";
	}
	
}
