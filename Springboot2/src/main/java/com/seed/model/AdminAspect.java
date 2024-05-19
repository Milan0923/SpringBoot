package com.seed.model;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Component
@Aspect
@EnableAspectJAutoProxy
public class AdminAspect {

	@Before("execution(public void move())")
	public void MusicOn() {
		System.out.println("Music on!!");
	}
	@After("execution(public void move())")
	public void MusicOff() {
		System.out.println("Music off!!");
	}
}
