package com.seed.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component("addr")
@Scope("prototype")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Address {

	private String city;
	private String country;
	private Long pinCode;
}
