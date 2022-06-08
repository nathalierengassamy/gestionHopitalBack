package com.inti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Ordonnance;
import com.inti.service.interfaces.IOrdonnanceService;

@RestController
@CrossOrigin
public class OrdonnanceController {
	
	@Autowired
	IOrdonnanceService ordonnanceService;
	
	@GetMapping("/ordonnances") 
	public List<Ordonnance> findAll() {
		return ordonnanceService.findAll();
	}

	@GetMapping("/ordonnances/{idOrdonnance}")
	public Ordonnance findOne(@PathVariable("idOrdonnance") Long id) {
		return ordonnanceService.findOne(id);
	}

	@PostMapping("/ordonnances") 
	public Ordonnance saveOrdonnance(@RequestBody Ordonnance ordonnance) {
		return ordonnanceService.save(ordonnance);
	}

	@DeleteMapping("/ordonnances/{idOrdonnance}") 
	public void deleteOrdonnance(@PathVariable("idOrdonnance") Long id) {
		ordonnanceService.delete(id);
	}
	
	@PutMapping("/ordonnances/{idOrdonnance}")
	public Ordonnance updateOrdonnanceWithPut(@PathVariable("idOrdonnance") Long id, @RequestBody Ordonnance ordonnance) { 
		Ordonnance currentOrdonnance = ordonnanceService.findOne(id);
		currentOrdonnance.setConsigne(ordonnance.getConsigne());
		currentOrdonnance.setMedicament(ordonnance.getMedicament());
		return ordonnanceService.save(currentOrdonnance);
	}

	@PatchMapping("/ordonnances/{idOrdonnance}")
	public Ordonnance updateOrdonnanceWithPatch(@PathVariable("idOrdonnance") Long id, @RequestBody Ordonnance ordonnance) {
		Ordonnance currentOrdonnance = ordonnanceService.findOne(id);
		currentOrdonnance.setConsigne(ordonnance.getConsigne());
		return ordonnanceService.save(currentOrdonnance);
	}
}

