package com.poliana.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poliana.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
