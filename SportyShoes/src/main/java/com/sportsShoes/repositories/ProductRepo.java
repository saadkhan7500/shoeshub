package com.sportsShoes.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sportsShoes.entities.Product;

@Repository
public interface ProductRepo extends CrudRepository<Product, Integer> {
	
  public Product findById(int id);
  
  @Query(value="select * from Products p where p.category = :category",nativeQuery=true)
  List<Product> findProdcutsByCategory(@Param("category")String category);
  
  @Query(value="select * from Products p where p.brand = :search or p.category = :search" , nativeQuery=true)
  List<Product> findProductsByBrandOrCatgegory(@Param("search")String search);

}
