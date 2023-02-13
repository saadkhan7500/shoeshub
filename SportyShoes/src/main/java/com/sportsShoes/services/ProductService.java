package com.sportsShoes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportsShoes.entities.Product;
import com.sportsShoes.repositories.ProductRepo;

@Service
public class ProductService {
	
	
	@Autowired
	private ProductRepo productRepo;
	
	
	
	public Product addProduct(Product product) { 
		
		return productRepo.save(product); 
		
     }
	
	public List<Product> getAllProducts() {
		
		return (List<Product>)productRepo.findAll(); 
	
	}
	
	public Product getProduct(int id)
	{ 
		return productRepo.findById(id); 
	}
	
	public Product updateProduct(Product product , int id)
	{
		Product p=productRepo.findById(id);
		p.setName(product.getName());
		p.setBrand(product.getBrand());
		p.setCategory(product.getCategory());
		p.setDiscount(product.getDiscount());
		p.setPrice(product.getPrice());
		p.setQuantity(product.getQuantity());
		p.setSize(product.getSize());
		p.setStatus(product.getStatus());
		
		return productRepo.save(p);
	}
	/*
	 * public List<Product> getAllProducts() { return (List<Product>)
	 * productRepo.findAll(); }
	 * 
	 * 
	 * public Product getProduct(int id) { return productRepo.findById(id); }
	 * 
	 * public Product createProduct(Product product) { return
	 * productRepo.save(product); }
	 * 
	 * 
	 * public Product updateProduct(Product product , int id) { Product
	 * p=productRepo.findById(id);
	 * 
	 * p.setName(product.getName()); p.setPrice(product.getPrice());
	 * p.setDiscount(product.getDiscount()); p.setSize(product.getSize());
	 * p.setQuantity(product.getQuantity());
	 * 
	 * return productRepo.save(p); }
	 * 
	 * public void deleteProduct(int id) { productRepo.deleteById(id); }
	 */
}
