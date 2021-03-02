package com.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.web.entity.ECategoria;

import com.web.model.Categoria;
import com.web.repository.CategoriaRepository;


@Service
public class CategoriaServiceImpl implements ICategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	

	@Override
	public List<Categoria> ListaCategorias() {
		List<Categoria> list = new ArrayList<>();		
		for(ECategoria ec: categoriaRepository.findAll()) {
			list.add(new Categoria(ec));
		}
		return list;
	}
	
 

}
