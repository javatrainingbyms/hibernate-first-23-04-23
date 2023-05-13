package com.ms.mapping;

import org.hibernate.Session;

import com.ms.Utility;

public class LaptopSearch {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Laptop laptop=session.get(Laptop.class, "L2");
		System.out.println(laptop.getLcode());
		System.out.println(laptop.getBrand());
		System.out.println(laptop.getPrice());
		Emp emp=laptop.getEmp();	
		System.out.println(emp.getEno());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		session.close();

	}
}
