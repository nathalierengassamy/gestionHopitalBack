package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.entities.TypeRDV;
import com.inti.repository.TypeRDVRepository;
import com.inti.service.interfaces.ITypeRDVService;

@Service
public class TypeRDVService implements ITypeRDVService{

	@Autowired
	TypeRDVRepository typeRDVRepository;

	@Override
	public List<TypeRDV> findAll() {

		return typeRDVRepository.findAll();
	}

	@Override
	public TypeRDV findOne(Long id) {

		return typeRDVRepository.findById(id).get();
	}

	@Override
	public TypeRDV save(TypeRDV typeRDV) {

		return typeRDVRepository.save(typeRDV);
	}

	@Override
	public void delete(Long id) {
		typeRDVRepository.deleteById(id);
	}
}
