package com.lazaro.curso.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lazaro.curso.entities.Product;
import com.lazaro.curso.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository userRepository;

	public List<Product> findAll() {
		List<Product> list = userRepository.findAll();
		return list;
	}
	
	public Product findById(Long id) {
		Optional<Product> obj  = userRepository.findById(id);
		return obj.get();
	}
	
	public Product save(Product user) {
		return userRepository.save(user);
	}

}
