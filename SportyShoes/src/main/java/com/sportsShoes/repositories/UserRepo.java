package com.sportsShoes.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sportsShoes.entities.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {

	public User findById(int id);

	//User findByEmail(String email);

	//User findByUsernameOrEmail(String username, String email);

	User findByUsername(String username);

	Boolean existsByUsername(String username);

	Boolean existsByEmail(String email);
}
