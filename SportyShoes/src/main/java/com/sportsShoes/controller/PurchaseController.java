package com.sportsShoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sportsShoes.entities.Purchase;
import com.sportsShoes.services.PurchaseService;

@RestController
public class PurchaseController {

	@Autowired
	private PurchaseService purchaseService;
	
	
	
	@PostMapping("/purchase/save")
	public Purchase save(@RequestBody Purchase purchase)
	{
		return purchaseService.savePurchaseProduct(purchase);
	}
	
}
