package com.felipehogrefe.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.felipehogrefe.cursomc.domain.Estado;
import com.felipehogrefe.cursomc.repositories.EstadoRepository;
import com.felipehogrefe.cursomc.services.exceptions.ObjectNotFoundException;


@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository repo;
	
	public Estado find(Integer id) {
		Optional<Estado> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Estado.class.getName()));
	}

}
