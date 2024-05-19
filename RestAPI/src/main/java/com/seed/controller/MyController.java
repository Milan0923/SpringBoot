package com.seed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.seed.model.Product;
import com.seed.service.ProductService;

@RestController
public class MyController {

	@Autowired
	ProductService service;
	
	@GetMapping("/getAllProduct")
	public List<Product> getAllProduct(){
		List<Product> pro = service.getAllProduct();
		return pro;
		
	}
	
	@GetMapping("/getProductById/{ProductID}")
	public Product getProductById(@PathVariable int ProductID){
		Product prod = service.getProductById(ProductID);
		return prod;
		
	}
	
	@GetMapping("/getProductByName/{nm}")
	public Product getProductByName(@PathVariable String nm){
//		return service.getProductByName(nm);
		Product prodt = service.getProductByName(nm);
		return prodt;
		
	}
	
	@GetMapping("/getProductbyPriceRange/{mn}/{mx}")
	public Product getProductByPriceRange(@PathVariable float mn,@PathVariable float mx){
		Product pro1 = service.getProductByPriceRange(mn, mx);
		return pro1;
		
	}
}
