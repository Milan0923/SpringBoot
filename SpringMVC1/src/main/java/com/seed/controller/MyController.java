package com.seed.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.seed.model.Product;
import com.seed.repo.ProductRepo;

@Controller
public class MyController {

	@Autowired
	ProductRepo repo;
	
	@RequestMapping("/")
	public ModelAndView Entrypointmethod() {
		System.out.println("Start");
		List<Product> prod = repo.findAll();
		ModelAndView mv =  new ModelAndView();
		mv.addObject("prod",prod);
		mv.setViewName("welcome.jsp");
		return mv;
	}
}
