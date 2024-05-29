package com.poliana.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poliana.curso.entities.Category;
import com.poliana.curso.entities.Product;
import com.poliana.curso.repositories.ProductRepository;

@Service//registra a classe como um componente do spring
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	
	
	public Product findById(Long id) {
		 Optional<Product> obj = repository.findById(id);
		 return obj.get();
	}
	

}
