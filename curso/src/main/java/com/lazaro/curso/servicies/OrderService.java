package com.lazaro.curso.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lazaro.curso.entities.Order;
import com.lazaro.curso.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;

	public List<Order> findAll() {
		List<Order> list = orderRepository.findAll();
		return list;
	}
	
	public Order findById(Long id) {
		Optional<Order> obj  = orderRepository.findById(id);
		return obj.get();
	}

}
