package com.sportsShoes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sportsShoes.entities.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {
	
  public Product findById(int id);

}
