package com.sportsShoes.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sportsShoes.entities.Cart;

@Repository
public interface CartRepo extends CrudRepository<Cart, Integer>{

}
