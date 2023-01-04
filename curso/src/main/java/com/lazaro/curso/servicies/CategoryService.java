package com.lazaro.curso.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lazaro.curso.entities.Category;
import com.lazaro.curso.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository CategoryRepository;

	public List<Category> findAll() {
		List<Category> list = CategoryRepository.findAll();
		return list;
	}
	
	public Category findById(Long id) {
		Optional<Category> obj  = CategoryRepository.findById(id);
		return obj.get();
	}
	
	public Category save(Category Category) {
		return CategoryRepository.save(Category);
	}

}
