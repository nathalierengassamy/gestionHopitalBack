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

import com.inti.entities.TypeRDV;
import com.inti.service.interfaces.ITypeRDVService;

@RestController
@CrossOrigin
public class TypeRDVController {

	@Autowired
	ITypeRDVService typeRDVService;

	@GetMapping("/typeRDVs")
	public List<TypeRDV> findAll() {
		return typeRDVService.findAll();
	}

	@GetMapping("/typeRDVs/{idTypeRDV}")
	public TypeRDV findOne(@PathVariable("idTypeRDV") Long id) {
		return typeRDVService.findOne(id);
	}

	@PostMapping("/typeRDVs")
	public TypeRDV saveTypeRDV(@RequestBody TypeRDV typeRDV) {
		return typeRDVService.save(typeRDV);
	}

	@DeleteMapping("/typeRDVs/{idTypeRDV}")
	public void deleteTypeRDV(@PathVariable("idTypeRDV") Long id) {
		typeRDVService.delete(id);
	}

	@PutMapping("/typeRDVs/{idTypeRDV}")
	public TypeRDV updateTypeRDVWithPut(@PathVariable("idTypeRDV") Long id, @RequestBody TypeRDV typeRDV) {
		TypeRDV currentTypeRDV = typeRDVService.findOne(id);
		currentTypeRDV.setLibelle(typeRDV.getLibelle());
		return typeRDVService.save(currentTypeRDV);
	}

	@PatchMapping("/typeRDVs/{idTypeRDV}")
	public TypeRDV updateTypeRDVWithPatch(@PathVariable("idTypeRDV") Long id, @RequestBody TypeRDV typeRDV) {
		TypeRDV currentTypeRDV = typeRDVService.findOne(id);
		currentTypeRDV.setLibelle(typeRDV.getLibelle());
		return typeRDVService.save(currentTypeRDV);
	}
}
