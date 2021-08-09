package com.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.entities.User;

public interface LoginRepository extends JpaRepository<User, Integer>{

	
}
