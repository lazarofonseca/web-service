package com.lazaro.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lazaro.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
