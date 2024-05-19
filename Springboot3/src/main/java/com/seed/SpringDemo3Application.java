package com.seed;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.seed.model.Product;
import com.seed.repo.ProductRepo;



@SpringBootApplication
public class SpringDemo3Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDemo3Application.class, args);
		
		ProductRepo repo = (ProductRepo) context.getBean("prorepo");
		
		
		
		repo.save(new Product(4,"Watch",5997.00));
		repo.save(new Product(5,"Sunglass",3499.00));
		
		List<Product> pro2= repo.findAll();
		System.out.println(pro2);
		List<Product> pro1 = repo.findByPrice(3499.00);
		System.out.println(pro1);
		
	}

}
