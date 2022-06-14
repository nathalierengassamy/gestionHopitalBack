package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Facture;
import com.inti.repository.FactureRepository;
import com.inti.service.interfaces.IFactureService;

@Service
public class FactureService implements IFactureService {
	@Autowired
	FactureRepository factureRepository;

	@Override
	public List<Facture> findAll() {
		return factureRepository.findAll();
	}
	
	public List<Facture> findByDossier(Long id) {
		return factureRepository.findByDossier(id);
	}

	@Override
	public Facture findOne(Long id) {

		return factureRepository.findById(id).get();
	}

	@Override
	public Facture save(Facture facture) {
		return factureRepository.save(facture);
	}

	@Override
	public void delete(Long id) {
		factureRepository.deleteById(id);
	}

}
