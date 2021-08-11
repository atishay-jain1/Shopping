package com.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.entities.User;
@Repository
public interface LoginRepository extends JpaRepository<User, Integer>{

	
}
