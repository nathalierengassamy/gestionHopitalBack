package com.inti.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Facture;
import com.inti.service.interfaces.IFactureService;

@RestController
public class FactureController {
	@Autowired
	IFactureService factureService;

	@GetMapping("/factures") 
	public List<Facture> findAll() {
		return factureService.findAll();
	}

	@GetMapping("/factures/{idFacture}") 
	public Facture findOne(@PathParam("idFacture") Long id) {
		return factureService.findOne(id);
	}

	@PostMapping("/factures") 
	public Facture saveFacture(@RequestBody Facture facture) {
		return factureService.save(facture);
	}

	@DeleteMapping("/factures/{idFacture}")
	public void deleteFacture(@PathParam("idFacture") Long id) {
		factureService.delete(id);
	}
	
	@GetMapping("/factures/{idDossier}") //à tester
    public List<Facture> findByDossier(@PathParam("idDossier") Long id) {
        return factureService.findByDossier(id);
    }

}
