package com.seed.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component("mdate")
@Scope("prototype")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MyDate {

	private int day, month, year;
}
