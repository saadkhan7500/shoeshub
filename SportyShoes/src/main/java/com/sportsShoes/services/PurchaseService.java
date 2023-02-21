package com.sportsShoes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportsShoes.entities.Product;
import com.sportsShoes.entities.Purchase;
import com.sportsShoes.entities.User;
import com.sportsShoes.repositories.ProductRepo;
import com.sportsShoes.repositories.PurchaseRepo;
import com.sportsShoes.repositories.UserRepo;

@Service
public class PurchaseService {
	
	@Autowired
	private PurchaseRepo purchaseRepo;
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private ProductRepo productRepo;
	
	public Purchase savePurchaseProduct(Purchase purchase)
	{
		return purchaseRepo.save(purchase);
	}



	public List<Product> purchaseProductByUser(String username) {
		// TODO Auto-generated method stub
		System.out.println("inside");
		System.out.println(username);
		User user=userRepo.findByUsername(username);
		System.err.println(user.getId());
		List<Purchase> purchaseList=null;
		if(user!=null)
		{
			purchaseList = purchaseRepo.findPuchaseById(user.getId());
			if(purchaseList!=null)
			{
			  List<Product> products=purchaseList.stream().map(e -> productRepo.findById(e.getProductId())).toList();
			  if(products!=null)
				  return products;
			}
		}
		return null;
	}

}
