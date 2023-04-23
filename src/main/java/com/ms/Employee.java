package com.ms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp")
public class Employee {
	
	@Id
	@Column(name="eno")
	private int code;
	
	@Column(name="name")
	private String empname;
	
	@Column(name="desg")
	private String designation;
	
	@Column(name="sal")
	private int salary;
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Employee(int code, String empname, String designation, int salary) {
		super();
		this.code = code;
		this.empname = empname;
		this.designation = designation;
		this.salary = salary;
	}
	public Employee() {
		super();
	}
	
	
}
