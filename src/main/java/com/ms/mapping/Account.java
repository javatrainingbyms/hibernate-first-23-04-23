package com.ms.mapping;

import javax.persistence.Entity;
import javax.persistence.Id;

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
	public Account(String ano) {
		super();
		this.ano = ano;
	}
	
}
