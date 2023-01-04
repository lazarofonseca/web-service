package com.lazaro.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lazaro.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
