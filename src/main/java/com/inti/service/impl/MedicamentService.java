package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.inti.entities.Medicament;
import com.inti.repository.MedicamentRepository;
import com.inti.service.interfaces.IMedicamentService;

public class MedicamentService implements IMedicamentService{

	@Autowired
	MedicamentRepository medicamentRepository;
	
	@Override
	public List<Medicament> findAll() {
		
		return medicamentRepository.findAll();
	}

	@Override
	public Medicament findOne(Long id) {
		
		return medicamentRepository.findById(id).get();
	}

	@Override
	public Medicament save(Medicament medicament) {

		return medicamentRepository.save(medicament);
	}

	@Override
	public void delete(Long id) {
		medicamentRepository.deleteById(id);
		
	}

}
