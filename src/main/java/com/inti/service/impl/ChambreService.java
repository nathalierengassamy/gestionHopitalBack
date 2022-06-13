package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.Chambre;
import com.inti.repository.ChambreRepository;
import com.inti.service.interfaces.IChambreService;

@Service
public class ChambreService implements IChambreService {

	@Autowired
	ChambreRepository chambreRepository;
	
	@Override
	public List<Chambre> findAll() {
		
		return chambreRepository.findAll();
	}

	@Override
	public Chambre findOne(Long id) {
		
		return chambreRepository.findById(id).get();
	}

	@Override
	public Chambre save(Chambre chambre) {

		return chambreRepository.save(chambre);
	}

	@Override
	public void delete(Long id) {
		chambreRepository.deleteById(id);
		
	}


}
