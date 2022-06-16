package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inti.entities.TypeRDV;

@Repository
public interface TypeRDVRepository extends JpaRepository<TypeRDV, Long>{

}
