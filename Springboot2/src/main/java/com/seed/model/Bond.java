package com.seed.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component("Bond")
@Scope("prototype")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Bond {

	@Autowired
	@Qualifier("bmw")
	private Car myCar;
}
