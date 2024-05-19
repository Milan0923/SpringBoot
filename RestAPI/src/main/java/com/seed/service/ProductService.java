package com.seed.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.seed.model.Product;
import com.seed.repo.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo repo;

	@GetMapping
	public List<Product> getAllProduct() {
		List<Product> lst = repo.findAll();
		return lst;
	}

	@GetMapping
	public Product getProductById(int productID) {
		Product pc= repo.findById(productID).get();
		return pc;
	}

	@GetMapping
	public Product getProductByName(String name) {
		Product pn= repo.findByName(name);
		return pn;
	}
	
	@GetMapping
	public Product getProductByPriceRange(float mn, float mx) {
		Product pr= repo.findByPriceRange(mn, mx);
		return pr;
	}
}
