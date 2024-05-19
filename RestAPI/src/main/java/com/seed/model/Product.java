package com.seed.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table
public class Product {

	@Id
	@Column(name="ProductID")
	private int productID;
	@Column(name="NAME", length=30)
	private String name;
	@Column(name="PRICE")
	private float price;
}
