package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Facture;

public interface IFactureService {
	List<Facture> findAll();

	public List<Facture> findByDossier(Long id);
	
	Facture findOne(Long id);

	Facture save(Facture facture);

	void delete(Long id);

}
