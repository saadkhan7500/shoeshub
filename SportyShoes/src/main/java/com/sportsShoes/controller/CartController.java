package com.sportsShoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sportsShoes.entities.Cart;
import com.sportsShoes.services.CartService;

@RestController
public class CartController {

	@Autowired
	private CartService cartService;
	
	
	
	@PostMapping("/cart/save")
	public Cart save(@RequestBody Cart cart)
	{
		return cartService.save(cart);
	}
	
}
