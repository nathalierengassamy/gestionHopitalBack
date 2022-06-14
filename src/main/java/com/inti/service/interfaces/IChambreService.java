package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Chambre;

public interface IChambreService {
	List<Chambre> findAll();
	
	Chambre findOne (Long id);
	
	Chambre save(Chambre rdv);
	
	void delete(Long id);
}
