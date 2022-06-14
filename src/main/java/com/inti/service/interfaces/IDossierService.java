package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.Dossier;

public interface IDossierService {
	List<Dossier> findAll();

	Dossier findOne(Long id);

	Dossier save(Dossier dossier);

	void delete(Long id);

}
