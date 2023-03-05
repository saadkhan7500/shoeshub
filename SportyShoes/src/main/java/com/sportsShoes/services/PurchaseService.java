package com.sportsShoes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.sportsShoes.Excpetion.PurchaseException;
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
	
	
	public Purchase savePurchaseProduct(Purchase purchase) throws PurchaseException
	{
		
		Product product=productRepo.findById(purchase.getProductId());
		System.out.println(product);
		int  quantity=Integer.parseInt(product.getQuantity());
		if(quantity>1)
		{
			quantity=quantity-1;
			String q=Integer.toString(quantity);
			product.setQuantity(q);
			productRepo.save(product);
			System.out.println("inside if");
			return purchaseRepo.save(purchase);
		}
		else if(quantity==1)
		{
			quantity=quantity-1;
			String q=Integer.toString(quantity);
			product.setQuantity(q);
			productRepo.save(product);
			product.setStatus("soled");
			productRepo.save(product);
			return purchaseRepo.save(purchase);
			
			
		}
		else
		throw new PurchaseException("this product has been soled out");

		
	}



	public List<Product> purchaseProductByUser(String username) {
		// TODO Auto-generated method stub

		User user=userRepo.findByUsername(username);
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



	public List<Product> purchasedProduct() {
		
		List<Purchase> purchaseList=purchaseRepo.findAll();
		if(purchaseList!=null)
		{
			List<Product> productList=purchaseList.stream().map(e -> productRepo.findById(e.getProductId())).toList();
			if(productList!=null)
				return productList;
		}
		return null;
	}

}
