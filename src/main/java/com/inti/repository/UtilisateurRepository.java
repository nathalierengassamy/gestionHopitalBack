package com.inti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Utilisateur;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long>{
	Utilisateur findByUsername(String username);
	List<Utilisateur> findByNomUtilisateur(String nomUtilisateur);
	@Query(value = "SELECT count(*) FROM Utilisateur", nativeQuery = true)
	int nbrUtilisateurs();
}
