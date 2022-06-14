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
	FactureRepository utilisateurRepository;

	@Override
	public List<Facture> findAll() {
		return utilisateurRepository.findAll();
	}

	@Override
	public Facture findOne(Long id) {

		return utilisateurRepository.findById(id).get();
	}

	@Override
	public Facture save(Facture facture) {
		return utilisateurRepository.save(facture);
	}

	@Override
	public void delete(Long id) {
		utilisateurRepository.deleteById(id);
	}

}
