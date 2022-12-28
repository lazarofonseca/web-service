package com.lazaro.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lazaro.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
