package com.inti.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.inti.entities.Chambre;
import com.inti.service.interfaces.IChambreService;

@RestController // RestFul WS
@CrossOrigin
public class ChambreController {
	@Autowired
	IChambreService chambreService;

	@GetMapping("/chambres")
	public List<Chambre> findAll() {
		return chambreService.findAll();
	}
	
	@GetMapping("/chambres/{idChambre}")
	public Chambre findOne(@PathVariable("idChambre") Long id) {
		return chambreService.findOne(id);
	}
	
	@PostMapping("/chambres")
	public Chambre saveChambre(@RequestBody Chambre chambre) {
		return chambreService.save(chambre);
	}

	@DeleteMapping("/chambres/{idChambre}")
	public void deleteChambre(@PathVariable("idChambre") Long id) {
		chambreService.delete(id);
	}
	
	@PutMapping("/chambres/{idChambre}")
	public Chambre updateChambreWithPut(@PathVariable("idChambre") Long id, @RequestBody Chambre chambre) { //
		Chambre currentChambre = chambreService.findOne(id);
		currentChambre.setNumChambre(chambre.getNumChambre());
		return chambreService.save(currentChambre);
	}

	@PatchMapping("/chambres/{idChambre}")
	public Chambre updateChambreWithPatch(@PathVariable("idChambre") Long id, @RequestBody Chambre chambre) {
		Chambre currentChambre = chambreService.findOne(id);
		currentChambre.setNumChambre(chambre.getNumChambre());
		return chambreService.save(currentChambre);
	}
}
