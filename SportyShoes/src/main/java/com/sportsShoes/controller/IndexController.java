package com.sportsShoes.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/userlogin")
	public String userLogin()
	{
		return "userlogin";
	}
	
	@RequestMapping("/usersignup")
	public String userSignup()
	{
		return "usersignup";
	}
	
	@RequestMapping("/adminlogin")
	public String adminLogin()
	{
		return "adminlogin";
	}
	
	@RequestMapping("/admindashboard")
	public String adminDashboard()
	{
		return "admindashboard";
	}
	
	@RequestMapping("/addproduct")
	public String addProduct()
	{
		return "addproduct";
	}
	
	@RequestMapping("/allproduct")
	public String allProduct()
	{
		return "allproduct";
	}
	
	@RequestMapping("/alluser")
	public String allUser()
	{
		return "alluser";
	}
	
	@RequestMapping("/userdashboard")
	public String userDashboard()
	{
		return "userdashboard";
	}
	
	@RequestMapping("/purchaseProduct")
	public String purchaseProduct()
	{
		return "purchaseProduct";
	}
	
	
	@RequestMapping("/purchaseAddress")
	public String purchaseAddress()
	{
		return "purchaseAddress";
	}
	
	@RequestMapping("/purchaseUserDetailsAddress")
	public String purchaseUserDetailsAddress()
	{
		return "purchaseUserDetailsAddress";
	}
	
	@RequestMapping("/payment")
	public String payment()
	{
		return "payment";
	}
	
	@RequestMapping("/OrderPlaced")
	public String OrderPlaced()
	{
		return "OrderPlaced";
	}
	
	@RequestMapping("/purchaseLogin")
	public String purchaseLogin()
	{
		return "purchaseLogin";
	}

	@RequestMapping("/myCart")
	public String myCart()
	{
		return "myCart";
	}
	
}
