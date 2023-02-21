package com.sportsShoes.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sportsShoes.entities.Cart;

@Repository
public interface CartRepo extends CrudRepository<Cart, Integer>{
	
	@Query(value="select * from Cart c where c.user_id = :id",nativeQuery=true)
	List<Cart> findCartById(int id);

}
