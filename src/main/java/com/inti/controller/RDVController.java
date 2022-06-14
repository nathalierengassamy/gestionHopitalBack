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

import com.inti.entities.RDV;
import com.inti.service.interfaces.IRDVService;

@RestController // RestFul WS
@CrossOrigin
public class RDVController {
	@Autowired
	IRDVService rdvService;

	@GetMapping("/rdvs")
	public List<RDV> findAll() {
		return rdvService.findAll();
	}

	@GetMapping("/rdvs/{idRDV}")
	public RDV findOne(@PathVariable("idRDV") Long id) {
		return rdvService.findOne(id);
	}

	@PostMapping("/rdvs")
	public RDV saveRDV(@RequestBody RDV rdv) {
		return rdvService.save(rdv);
	}

	@DeleteMapping("/rdvs/{idRDV}")
	public void deleteRDV(@PathVariable("idRDV") Long id) {
		rdvService.delete(id);
	}

	@PutMapping("/rdvs/{idRDV}")
	public RDV updateRDVWithPut(@PathVariable("idRDV") Long id, @RequestBody RDV rdv) { //
		RDV currentRDV = rdvService.findOne(id);
		currentRDV.setTypeRDV(rdv.getTypeRDV());
		return rdvService.save(currentRDV);
	}

	@PatchMapping("/rdvs/{idRDV}")
	public RDV updateRDVWithPatch(@PathVariable("idRDV") Long id, @RequestBody RDV rdv) {
		RDV currentRDV = rdvService.findOne(id);
		currentRDV.setTypeRDV(rdv.getTypeRDV());
		return rdvService.save(currentRDV);
	}
}
