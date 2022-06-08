package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.RDV;
import com.inti.entities.RDV;
import com.inti.repository.RDVRepository;
import com.inti.service.interfaces.IRDVService;

@Service
public class RDVService implements IRDVService {

	@Autowired
	RDVRepository rdvRepository;
	
	@Override
	public List<RDV> findAll() {
		
		return rdvRepository.findAll();
	}

	@Override
	public RDV findOne(Long id) {
		
		return rdvRepository.findById(id).get();
	}

	@Override
	public RDV save(RDV rdv) {

		return rdvRepository.save(rdv);
	}

	@Override
	public void delete(Long id) {
		rdvRepository.deleteById(id);
		
	}

}
