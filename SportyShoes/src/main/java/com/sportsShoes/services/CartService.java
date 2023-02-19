package com.sportsShoes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportsShoes.entities.Cart;
import com.sportsShoes.repositories.CartRepo;

@Service
public class CartService 
{

	@Autowired
	private CartRepo cartRepo;
	
	
	public Cart save(Cart cart)
	{
		return cartRepo.save(cart);
	}
}
