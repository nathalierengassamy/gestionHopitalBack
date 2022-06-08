package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.Ordonnance;

@Repository
public interface OrdonnanceRepository extends JpaRepository<Ordonnance,Long>{

}
