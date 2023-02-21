package com.sportsShoes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportsShoes.entities.Cart;
import com.sportsShoes.entities.Product;
import com.sportsShoes.entities.User;
import com.sportsShoes.repositories.CartRepo;
import com.sportsShoes.repositories.ProductRepo;
import com.sportsShoes.repositories.UserRepo;

@Service
public class CartService 
{

	@Autowired
	private CartRepo cartRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ProductRepo productRepo;
	
	
	public Cart save(Cart cart)
	{
		return cartRepo.save(cart);
	}


	public List<Product> getCartProductByUserName(String username) 
	{
		User user=userRepo.findByUsername(username);
		if(user!=null)
		{
		  List<Cart> cart=cartRepo.findCartById(user.getId());
		  if(cart!=null)
		  {
			  List<Product> list=cart.stream().map(e-> productRepo.findById(e.getProductId())).toList();
			  return list;
		  }
		}
		return null;
	}
}
