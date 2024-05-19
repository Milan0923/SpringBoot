package com.seed.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component("cust")
@Scope("prototype")
@Getter
@Setter
@ToString
@NoArgsConstructor
//@AllArgsConstructor
public class Customer {

	private int custId;
	private String custName;
//	@Autowired
	private Address addr;
//	@Autowired
	private MyDate birthDate;
	
	@Autowired
	public Customer(int custId, String custName, Address addr, MyDate birthDate) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.addr = addr;
		this.birthDate = birthDate;
	}
	
	
}
