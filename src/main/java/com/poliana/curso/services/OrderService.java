package com.poliana.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poliana.curso.entities.Order;
import com.poliana.curso.repositories.OrderRepository;

@Service//registra a classe como um componente do spring
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	
	
	public Order findById(Long id) {
		 Optional<Order> obj = repository.findById(id);
		 return obj.get();
	}
	

}
