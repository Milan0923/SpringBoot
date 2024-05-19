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


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "cityinfo")

public class CityInfo {
	@Id
	@Column(name = "city",length=20)
	private String city;
	
	@Column(name = "info",length=200)
	private String info;

}
