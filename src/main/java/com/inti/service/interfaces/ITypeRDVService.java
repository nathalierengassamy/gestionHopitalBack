package com.inti.service.interfaces;

import java.util.List;

import com.inti.entities.TypeRDV;

public interface ITypeRDVService {

	List<TypeRDV> findAll();

	TypeRDV findOne(Long id);

	TypeRDV save(TypeRDV typeRDV);

	void delete(Long id);
}
