package com.sportsShoes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportsShoes.entities.Purchase;
import com.sportsShoes.repositories.PurchaseRepo;

@Service
public class PurchaseService {
	
	@Autowired
	private PurchaseRepo purchaseRepo;
	
	
	
	public Purchase savePurchaseProduct(Purchase purchase)
	{
		return purchaseRepo.save(purchase);
	}

}
