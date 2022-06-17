package com.inti.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Facture;

@Repository
public interface FactureRepository extends JpaRepository<Facture, Long> {

	@Query(value = "SELECT * FROM facture WHERE id_dossier = ?1", nativeQuery = true) //validé sur phpmyadmin
    List<Facture> findByDossier(long idDossier);

}
