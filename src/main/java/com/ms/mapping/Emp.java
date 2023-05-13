package com.ms.mapping;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Emp {
	@Id
	private int eno;
	private String name;
	private int salary;
	@OneToOne		//Emp->Laptop
	private Laptop laptop;	//laptop_lcode
	@OneToMany
	private List<Account> accounts;
	public Emp(int eno, String name, int salary, Laptop laptop) {
		super();
		this.eno = eno;
		this.name = name;
		this.salary = salary;
		this.laptop = laptop;
	}
	
	
}
