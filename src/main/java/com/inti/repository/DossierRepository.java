package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Dossier;

@Repository
public interface DossierRepository extends JpaRepository<Dossier, Long> {

}
