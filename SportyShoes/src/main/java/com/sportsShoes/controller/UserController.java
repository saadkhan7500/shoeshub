package com.sportsShoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sportsShoes.Excpetion.UserException;
import com.sportsShoes.authentication.UserAuthentication;
import com.sportsShoes.entities.User;
import com.sportsShoes.repositories.UserRepo;
import com.sportsShoes.services.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserRepo userRepo;
	
	@GetMapping("/user/getusers")
	public List<User> getAllUsers() throws UserException {
		return userService.getAllUsers();
	}

	@GetMapping("/user/getuser/{id}")
	public ResponseEntity<?> getUser(@PathVariable("id") int id) throws UserException {
		return new ResponseEntity<>(userService.getUser(id),HttpStatus.OK);
	}

	@PostMapping("/user/signup")
	public ResponseEntity<?> createUser(@RequestBody @Valid User user) {
		
		if(userRepo.existsByUsername(user.getUsername()))
		{
			return new ResponseEntity<>("username is already taken",HttpStatus.BAD_REQUEST);
		}
		if(userRepo.existsByEmail(user.getEmail()))
		{
			return new ResponseEntity<>("email is already taken",HttpStatus.BAD_REQUEST);
		}

		return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
	}

	@PostMapping("user/authentication")
	public ResponseEntity<?> userAuthentication(@RequestBody UserAuthentication authentication) throws UserException
	{
		User u=userService.userAuthentication(authentication);
		return new ResponseEntity<>(u,HttpStatus.OK);
		
	}
//	@PutMapping("/users/{id}")
//	public User updateUser(@RequestBody User user, @PathVariable("id") int id) {
//		return userService.updateUser(user, id);
//	}

	@DeleteMapping("/user/deleteuser/{id}")
	public void deleteUser(@PathVariable("id") int id) throws UserException {
		userService.delete(id);
	}

//	@GetMapping("/users/{username}/{password}")
//	public User getEmailandPassword(@PathVariable("username") String username,
//			@PathVariable("password") String password) {
//		return userService.getEmailAndPassword(username, password);
//	}
}
