package com.sportsShoes.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sportsShoes.entities.Purchase;

public interface PurchaseRepo extends CrudRepository<Purchase, Integer> 
{
   
}
