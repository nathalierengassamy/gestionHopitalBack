package com.inti.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.inti.entities.Utilisateur;
import com.inti.service.interfaces.IUtilisateurService;

@RestController
@CrossOrigin
public class UtilisateurController {
	@Autowired
	IUtilisateurService utilisateurService;

	@Autowired
	PasswordEncoder passwordEncoder;

	@GetMapping("utilisateurs")
	public List<Utilisateur> findAll() {
		return utilisateurService.findAll();
	}

	@GetMapping("utilisateurs/{nom}")
	public List<Utilisateur> findByName(@PathVariable("nom") String nom) {
		List<Utilisateur> utilisateurs = utilisateurService.findByNomUtilisateur(nom);
		return utilisateurs;
	}

	@PostMapping("utilisateurs") 
	public Utilisateur saveUtilisateur(@RequestBody Utilisateur utilisateur) { 
		Utilisateur currentUser=new Utilisateur(utilisateur.getNomUtilisateur(),
		utilisateur.getPrenomUtilisateur(),
		utilisateur.getUsername(),
		passwordEncoder.encode(utilisateur.getPassword()),
		utilisateur.getRoles());
		return utilisateurService.save(currentUser); 
	}

	@DeleteMapping("utilisateurs/{idUtilisateur}")
	public void deleteUtilisateur(@PathVariable("idUtilisateur") Long idUtilisateur) {
		utilisateurService.delete(idUtilisateur);
	}

	@PutMapping("utilisateurs/{idUtilisateur}")
	public Utilisateur updateUtilisateur(@PathVariable("idUtilisateur") Long idUtilisateur, @RequestBody Utilisateur utilisateur ) {
		Utilisateur currentUtilisateur = utilisateurService.findOne(idUtilisateur);
		currentUtilisateur.setNomUtilisateur(utilisateur.getNomUtilisateur());
		currentUtilisateur.setPrenomUtilisateur(utilisateur.getPrenomUtilisateur());
		currentUtilisateur.setUsername(utilisateur.getUsername());
		currentUtilisateur.setPassword(utilisateur.getPassword());
		currentUtilisateur.setAdresseUtilisateur(utilisateur.getAdresseUtilisateur());
		currentUtilisateur.setAgeUtilisateur(utilisateur.getAgeUtilisateur());
		currentUtilisateur.setDateNaissance(utilisateur.getDateNaissance());
		currentUtilisateur.setTelephone(utilisateur.getTelephone());
		currentUtilisateur.setRoles(utilisateur.getRoles());
		return utilisateurService.save(currentUtilisateur);
	}
	/*
	 * @GetMapping("utilisateurs") public int nbrUtilisateurs() { return
	 * utilisateurService.nbrUtilisateurs(); }
	 */
}