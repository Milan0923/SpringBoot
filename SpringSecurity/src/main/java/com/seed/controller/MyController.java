package com.seed.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.seed.model.Seed;
import com.seed.repo.SeedRepo;

@Controller
public class MyController {

	@Autowired
	SeedRepo repo;
	
	@RequestMapping("/")
	public String entryPointMethod() {
		System.out.println("Entry Point Method!!");
		return "First.jsp";
	}
	
	@RequestMapping("/show")
	public ModelAndView getinfo(String StudentName) {
		System.out.println("Information");
		Optional<Seed> stud=repo.findById(StudentName);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("StudentInfo.jsp");
		mv.addObject("studin", stud);
		return mv;
	}
}
