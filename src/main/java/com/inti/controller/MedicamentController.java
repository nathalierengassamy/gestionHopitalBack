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

import com.inti.entities.Medicament;
import com.inti.service.interfaces.IMedicamentService;

@RestController
@CrossOrigin
public class MedicamentController {
	@Autowired
	IMedicamentService medicamentService;
	
	@GetMapping("/medicaments") 
	public List<Medicament> findAll() {
		return medicamentService.findAll();
	}

	@GetMapping("/medicaments/{idMedicament}") 
	public Medicament findOne(@PathVariable("idMedicament") Long id) {
		return medicamentService.findOne(id);
	}

	@PostMapping("/medicaments") 
	public Medicament saveMedicament(@RequestBody Medicament medicament) {
		return medicamentService.save(medicament);
	}

	@DeleteMapping("/medicaments/{idMedicament}")
	public void deleteMedicament(@PathVariable("idMedicament") Long id) {
		medicamentService.delete(id);
	}

	@PutMapping("/medicaments/{idMedicament}") 
	public Medicament updateMedicamentWithPut(@PathVariable("idMedicament") Long id,
			@RequestBody Medicament medicament) { //
		Medicament currentUser = medicamentService.findOne(id);
		System.out.println(currentUser.toString());
		currentUser.setLibelleMedicament(medicament.getLibelleMedicament()); 
		currentUser.setPrixMedicament(medicament.getPrixMedicament()); 
		currentUser.setDateExpiration(medicament.getDateExpiration());
		currentUser.setStock(medicament.getStock());
		return medicamentService.save(currentUser);
	}

	@PatchMapping("/medicaments/{idMedicament}")
	public Medicament updateMedicamentWithPatch(@PathVariable("idMedicament") Long id,
			@RequestBody Medicament medicament) {
		Medicament currentUser = medicamentService.findOne(id);
		currentUser.setIdMedicament(medicament.getIdMedicament());
		return medicamentService.save(currentUser);
	}
}

