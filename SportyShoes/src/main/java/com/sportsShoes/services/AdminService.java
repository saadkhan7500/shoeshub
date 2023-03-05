package com.sportsShoes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportsShoes.entities.Admin;
import com.sportsShoes.repositories.AdminRepo;

@Service
public class AdminService {

	@Autowired
	private AdminRepo adminRepo;
	
	public Admin getAdmin(Admin admin)
	{
		return adminRepo.findByUsernameAndPassword(admin.getUsername(), admin.getPassword());
		  
	}

	public Admin findByUsername(String username) {
		
		return adminRepo.findByUsername(username);
	}

	public Admin save(Admin ad) 
	{
		return adminRepo.save(ad);
	}
}
