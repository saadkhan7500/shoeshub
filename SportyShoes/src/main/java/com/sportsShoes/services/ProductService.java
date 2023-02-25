package com.sportsShoes.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sportsShoes.Excpetion.ProductException;
import com.sportsShoes.entities.Product;
import com.sportsShoes.repositories.ProductRepo;

@Service
public class ProductService {
	
	
	@Autowired
	private ProductRepo productRepo;

	
	public Product addProduct(Product product) 
	{ 
		product.setStatus("added");
		return productRepo.save(product); 
		
     }
	
	public List<Product> getAllProducts() throws ProductException {
		
		 List<Product> products=(List<Product>) productRepo.findAll();
		 if(products!=null)
		 return products;
		 else
			 throw new ProductException("no record found for products");
	
	}
	
	public Product getProduct(int id) throws ProductException
	{ 
		Product product=productRepo.findById(id);
		if(product!=null)
		return product;
		else
			throw new ProductException("product does not exist with this id = "+id);
	}
	
	public Product updateProduct(Product product , int id) throws ProductException
	{
		Product p=productRepo.findById(id);
		if(p!=null)
		{
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
		else
			throw new ProductException("product does not exist with this id = "+id);
	}
	
	public List<Product> findProdcutsByCategory(String category) throws ProductException
	{
		List<Product> products=productRepo.findProdcutsByCategory(category);
		if(products.size()!=0)
		return products;
		else
			throw new ProductException("product does not exist");
	}
	
	public List<Product> findProductsByBrandOrCatgegory(String search) throws ProductException
	{
		List<Product> products=productRepo.findProductsByBrandOrCatgegory(search);
		if(products.size()!=0)
			return products;
			else
				throw new ProductException("product does not exist");
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
