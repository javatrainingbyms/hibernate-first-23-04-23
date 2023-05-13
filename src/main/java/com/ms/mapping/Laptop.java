package com.ms.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Laptop {
	@Id
	private String lcode;
	private String brand;
	private int price;
	@OneToOne (mappedBy = "laptop")	//Laptop->Emp
	private Emp emp;	
	
	public Laptop(String lcode, String brand, int price) {
		super();
		this.lcode = lcode;
		this.brand = brand;
		this.price = price;
	}
	public Laptop(String lcode) {
		super();
		this.lcode = lcode;
	}
	
}
