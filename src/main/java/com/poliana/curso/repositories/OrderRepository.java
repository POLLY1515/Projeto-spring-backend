package com.poliana.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poliana.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
