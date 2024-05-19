package com.seed.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class SpringDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDemoApplication.class, args);
		 
		 Customer cust1 = (Customer) context.getBean("cust",101,"Ayush",
				 context.getBean("addr","Pune","India",411057L),
				 context.getBean("mdate",02,02,2024));
		 System.out.println(cust1);
	}

}
