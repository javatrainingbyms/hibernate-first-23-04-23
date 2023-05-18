package com.ms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
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
	@SequenceGenerator(name = "seq1", sequenceName = "eno_seq", initialValue = 1001)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq1")
	private int eno;
	@Column(name = "ename", length = 50, nullable = false)
	private String empname;
	@Column(name = "desg", length = 40, nullable = true)
	private String designation;
	private int salary;
	public Employee(String empname, String designation, int salary) {
		super();
		this.empname = empname;
		this.designation = designation;
		this.salary = salary;
	}
	
}
