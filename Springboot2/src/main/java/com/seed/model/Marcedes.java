package com.seed.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("mar")
@Scope("prototype")
public class Marcedes implements Car {

	@Override
	public void move() {
		System.out.println("Running at 220 kmph");
		
	}

}
