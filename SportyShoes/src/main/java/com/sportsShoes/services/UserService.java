package com.sportsShoes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportsShoes.authentication.UserAuthentication;
import com.sportsShoes.entities.User;
import com.sportsShoes.repositories.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public List<User> getAllUsers()
	{
		return (List<User>) userRepo.findAll();
	}
	
	public User getUser(int id)
	{
		return userRepo.findById(id);
	}
	
	public User createUser(User user)
	{
		return userRepo.save(user);
	}
	
	public User userAuthentication(UserAuthentication authentication)
	{
		User u= userRepo.findByUsername(authentication.getUsername());
		if(u.getUsername().equals(authentication.getUsername())&& u.getPassword().equals(authentication.getPassword()))
				{
			         return u;
				}
		
		return null;
	}
	
//	public User updateUser(User user , int id)
//	{
//		User u=userRepo.findById(id);
//		u.setFname(user.getFname());
//		u.setLname(user.getLname());
//		u.setEmail(user.getEmail());
//		u.setMobile(user.getMobile());
//		u.setPassword(user.getPassword());
//		
//		return userRepo.save(u);
//	}
//	
	public void delete(int id)
	{
		userRepo.deleteById(id);
	}
//	
//	
//	public User getEmailAndPassword(String username,String password)
//	{
//		return userRepo.findByEmailAndPassword(username, password);
//	}

}
