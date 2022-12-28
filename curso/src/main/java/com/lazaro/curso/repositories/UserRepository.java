package com.lazaro.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lazaro.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
