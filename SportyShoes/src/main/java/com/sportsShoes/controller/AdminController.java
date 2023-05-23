package com.sportsShoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sportsShoes.entities.Admin;
import com.sportsShoes.services.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;
	
	@PostMapping("/admin/check")
	public ResponseEntity<?> getAdmin(@RequestBody Admin admin)
	{
		System.out.println(admin.getUsername()+"   "+admin.getPassword());
		return new ResponseEntity<>(adminService.getAdmin(admin),HttpStatus.OK);
	}
	
	@PostMapping(value="/admin/resetpassword")
	public String resetPassword(@RequestBody Admin admin)
	{
		System.out.println(admin);
		Admin ad = adminService.findByUsername(admin.getUsername());
		
		ad.setPassword(admin.getPassword());
		adminService.save(ad);
		
		return "success";
	}
}
