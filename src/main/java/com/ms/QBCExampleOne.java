package com.ms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class QBCExampleOne {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		List<Employee> employees=criteria.list();	//select * from emp;	//all rows , cols
		for(Employee employee:employees) {
			System.out.print(employee.getCode()+",");
			System.out.print(employee.getEmpname()+",");
			System.out.print(employee.getSalary()+",");
			System.out.println(employee.getDesignation());
			System.out.println("------------------------------------");
		}
		session.close();
	}

}
