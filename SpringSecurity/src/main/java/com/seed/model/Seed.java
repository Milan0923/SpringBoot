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
public class Seed {
	
	@Id
	@Column(name = "studentName",length=25)
	private String studName;
	
	@Column(name = "studentInfo",length=100)
	private String studInfo;
}
