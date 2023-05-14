package com.ms.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
	@Id
	private String ano;
	private String bank;
	private String branch;
	@ManyToOne
	private Emp emp;	//additional column emp_eno in accounts table
	public Account(String ano) {
		super();
		this.ano = ano;
	}
	
}
