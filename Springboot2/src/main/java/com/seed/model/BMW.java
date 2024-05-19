package com.seed.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("bmw")
@Scope("prototype")
public class BMW implements Car {

	@Override
	public void move() {
		System.out.println("Running at 250 kmph");
	}

}
