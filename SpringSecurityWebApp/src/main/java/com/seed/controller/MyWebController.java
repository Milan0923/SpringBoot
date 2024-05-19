package com.seed.controller;

import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.seed.model.CityInfo;
import com.seed.repo.CityRepo;

@Controller
public class MyWebController {
	@Autowired
	CityRepo repo;
	
	@RequestMapping("/")
	public String entryPointMethod() {
		System.out.println("entryPointMethod...");
		return "welcome.jsp";
	}
	
	@RequestMapping("/show")
	public ModelAndView getinfo(String city) {
		System.out.println("getinfo....");
		Optional<CityInfo> cinfo=repo.findById(city);
		ModelAndView mv=new ModelAndView();
		mv.setViewName("info.jsp");
		mv.addObject("cinfo", cinfo);
		return mv;		
	}
	
	/*
	 * @RequestMapping("/show") public String getinfo(HttpServletRequest request) {
	 * System.out.println("getinfo...."); String city=request.getParameter("city");
	 * CityInfo cinfo=repo.findById(city).get(); return "info.jsp"; }
	 */

}
