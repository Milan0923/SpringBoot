package com.seed;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class AppSecurityConfig extends WebSecurityConfigurerAdapter{

@Override
@Bean
protected UserDetailsService userDetailsService() {
	List<UserDetails> users=new ArrayList<UserDetails>();
	users.add(User.withDefaultPasswordEncoder().username("seed").password("info").roles("USER").build());
	users.add(User.withDefaultPasswordEncoder().username("rohan").password("rohan@123").roles("USER").build());	
	users.add(User.withDefaultPasswordEncoder().username("abhinav").password("abhinav@seed").roles("USER").build());
	return new InMemoryUserDetailsManager(users);
	}
}










