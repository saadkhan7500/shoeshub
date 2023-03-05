package com.sportsShoes.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.sportsShoes.entities.Purchase;

public interface PurchaseRepo extends CrudRepository<Purchase, Integer> 
{
	@Query(value="select * from Purchase p where p.user_id = :id",nativeQuery=true)
	  List<Purchase> findPuchaseById(int id);
   
   
}
