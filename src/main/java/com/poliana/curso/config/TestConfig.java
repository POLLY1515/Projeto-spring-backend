package com.poliana.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.poliana.curso.entities.Category;
import com.poliana.curso.entities.Order;
import com.poliana.curso.entities.User;
import com.poliana.curso.entities.enuns.OrderStatus;
import com.poliana.curso.repositories.CategoryRepository;
import com.poliana.curso.repositories.OrderRepository;
import com.poliana.curso.repositories.UserRepository;

@Configuration
@Profile("test")//Responsavel por rodar a configuração somete no perfil de teste
public class TestConfig implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;//dependencia
    
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics"); 
		Category cat2 = new Category(null, "Books"); 
		Category cat3 = new Category(null, "Computers"); 
		
		
		
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),OrderStatus.DELIVERED, u1); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.PAID, u2); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.SHIPPED, u1); 
		
		
		
		
		
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		userRepository.saveAll(Arrays.asList(u1,u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
		

		
	}
	
	
}