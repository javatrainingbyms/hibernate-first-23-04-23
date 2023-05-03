package com.ms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emp")
public class Employee {
	@Id
	@Column(name="code")
	private int eno;
	@Column(name = "ename", length = 50, nullable = false)
	private String empname;
	@Column(name = "desg", length = 40, nullable = true)
	private String designation;
	private int salary;
}
