package com.sportsShoes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sportsShoes.entities.Admin;

@Repository
public interface AdminRepo extends CrudRepository<Admin, Integer> {
	
	public Admin findByUsernameAndPassword(String username, String password);

	public Admin findByUsername(String username);
}
