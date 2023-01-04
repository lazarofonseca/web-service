package com.lazaro.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lazaro.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
