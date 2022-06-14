package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Ordonnance;
import com.inti.repository.OrdonnanceRepository;
import com.inti.service.interfaces.IOrdonnanceService;

@Service
public class OrdonnanceService implements IOrdonnanceService{
	
	@Autowired
	OrdonnanceRepository ordonnanceRepository;

	@Override
	public List<Ordonnance> findAll() {

		return ordonnanceRepository.findAll();
	}

	@Override
	public Ordonnance findOne(Long id) {

		return ordonnanceRepository.findById(id).get();
	}

	@Override
	public Ordonnance save(Ordonnance ordonnance) {
		
		return ordonnanceRepository.save(ordonnance);
	}

	@Override
	public void delete(Long id) {
		ordonnanceRepository.deleteById(id);
		
	}

}
