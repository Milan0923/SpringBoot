package com.seed.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class Product {
	@Id
	@Column(name= "PRODUCTID")
	private int proId;
	@Column(name= "NAME")
	private String proName;
	@Column(name= "PRICE")
	private double price;
}
