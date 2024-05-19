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
	users.add(User.withDefaultPasswordEncoder().username("Shivam").password("nidhi").roles("USER").build());
	users.add(User.withDefaultPasswordEncoder().username("Swapnil").password("roshni").roles("USER").build());	
	users.add(User.withDefaultPasswordEncoder().username("Abhinav").password("abhinav@seed").roles("USER").build());
	return new InMemoryUserDetailsManager(users);
	}
}










