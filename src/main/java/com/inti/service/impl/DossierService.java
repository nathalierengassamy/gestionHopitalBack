package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Dossier;
import com.inti.repository.DossierRepository;
import com.inti.service.interfaces.IDossierService;

@Service
public class DossierService implements IDossierService  {
	@Autowired
	DossierRepository dossierRepository;

	@Override
	public List<Dossier> findAll() {

		return dossierRepository.findAll();
	}

	@Override
	public Dossier findOne(Long id) {

		return dossierRepository.findById(id).get();
	}

	@Override
	public Dossier save(Dossier dossier) {

		return dossierRepository.save(dossier);
	}

	@Override
	public void delete(Long id) {
		dossierRepository.deleteById(id);
	}

}
