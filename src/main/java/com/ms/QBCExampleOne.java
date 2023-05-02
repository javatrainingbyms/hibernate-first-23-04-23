package com.ms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class QBCExampleOne {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		Criterion crt=Restrictions.eq("designation", "sse");	//where desg='sse'
		List<Employee> employees=criteria.list();	//select * from emp;	//all rows , cols
		for(Employee employee:employees) {
			System.out.print(employee.getEno()+",");
			System.out.print(employee.getEmpname()+",");
			System.out.print(employee.getSalary()+",");
			System.out.println(employee.getDesignation());
			System.out.println("------------------------------------");
		}
		session.close();
	}

}
