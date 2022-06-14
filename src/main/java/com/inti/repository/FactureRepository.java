package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Facture;

@Repository
public interface FactureRepository extends JpaRepository<Facture, Long> {

}
