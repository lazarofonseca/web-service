package com.lazaro.curso.servicies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lazaro.curso.entities.User;
import com.lazaro.curso.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> findAll() {
		List<User> list = userRepository.findAll();
		return list;
	}
	
	public User findById(Long id) {
		Optional<User> obj  = userRepository.findById(id);
		return obj.get();
	}
	
	public User save(User user) {
		return userRepository.save(user);
	}

}
