package com.sportsShoes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportsShoes.Excpetion.UserException;
import com.sportsShoes.authentication.UserAuthentication;
import com.sportsShoes.entities.User;
import com.sportsShoes.repositories.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	
	public List<User> getAllUsers() throws UserException
	{
		List<User> users=(List<User>) userRepo.findAll();
		if(users.size()!=0)
			return users;
		else
			throw new UserException("no records found for user");
	}
	
	public User getUser(int id) throws UserException
	{
		User user =userRepo.findById(id);
		if(user!=null)
		     return user;
		else
			throw new UserException("user not found with this id "+id);
	}
	
	public User createUser(User user)
	{
		return userRepo.save(user);
	}
	
	public User userAuthentication(UserAuthentication authentication) throws UserException
	{
		User u= userRepo.findByUsernameAndPassword(authentication.getUsername(),authentication.getPassword());
		if(u!=null)
		{
		  if(u.getUsername().equals(authentication.getUsername())&& u.getPassword().equals(authentication.getPassword()))
				{
			         return u;
				}
	    }
		else
		{
			throw new UserException("user not found with this cred");
		}
		return u;
	
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
	public void delete(int id) throws UserException
	{
		User user=userRepo.findById(id);
		if(user!=null)
		userRepo.deleteById(id);
		else
			throw new UserException("can't delete user with this id ="+id);
	}
//	
//	
//	public User getEmailAndPassword(String username,String password)
//	{
//		return userRepo.findByEmailAndPassword(username, password);
//	}

}
