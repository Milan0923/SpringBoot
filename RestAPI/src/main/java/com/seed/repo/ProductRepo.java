package com.seed.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.seed.model.Product;
import java.util.List;


@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{
	
	@Query("from Product p where p.name=:mn")
	Product findByName(String mn);

	@Query("from Product p where p.price between :mn and :mx")
	Product findByPriceRange(float mn, float mx);
}
