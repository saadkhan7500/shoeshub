package com.sportsShoes.repository;

import org.springframework.data.repository.CrudRepository;

import com.sportsShoes.entities.Product;

public interface ProductRepositories extends CrudRepository<Product, Integer>{

}
