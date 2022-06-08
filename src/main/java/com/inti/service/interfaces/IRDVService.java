package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.RDV;

public interface IRDVService {
	List<RDV> findAll();
	
	RDV findOne (Long id);
	
	RDV save(RDV rdv);
	
	void delete(Long id);
}
