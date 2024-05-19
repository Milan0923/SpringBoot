package com.seed.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.seed.model.Product;

@Repository("prorepo")
public interface ProductRepo extends JpaRepository<Product, Integer> {

	@Query("from Product p where p.price=:pr")
	List<Product> findByPrice(double pr);
}
