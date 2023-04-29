package com.ms;

import org.hibernate.Session;

public class QBIExample {

	public static void main(String[] args) {
		//Query By Id : get/load
		
		Session session = Utility.getSessionFactory().openSession();
		Employee emp = session.get(Employee.class, 2001);
		if (emp != null) {
			System.out.println(emp.getCode());
			System.out.println(emp.getEmpname());
			System.out.println(emp.getDesignation());
			System.out.println(emp.getSalary());
		} else {
			System.out.println("invalid code ....!!");
		}
		session.close();

	}

}
