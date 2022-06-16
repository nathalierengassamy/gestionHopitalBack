package com.inti.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Dossier;
import com.inti.service.interfaces.IDossierService;

@RestController
public class DossierController {
	@Autowired
	IDossierService dossierService;

	@GetMapping("/dossiers")
	public List<Dossier> findAll() {
		return dossierService.findAll();
	}

	@GetMapping("/dossiers/{idDossier}") 
	public Dossier findOne(@PathParam("idDossier") Long id) {
		return dossierService.findOne(id);
	}

	@PostMapping("/dossiers") 
	public Dossier saveDossiers(@RequestBody Dossier dossiers) {
		return dossierService.save(dossiers);
	}

	@DeleteMapping("/dossiers/{idDossier}") 
	public void deleteDossier(@PathParam("idDossier") Long id) {
		dossierService.delete(id);
	}
}
