package com.ms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class QBCExampleFour {
	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		//criteria.add(Restrictions.between("salary", 40000, 50000));
		//criteria.add(Restrictions.in("designation", "se","sse"));
		criteria.add(Restrictions.like("empname", "s%"));
		List<Employee> employees=criteria.list();	
		for(Employee employee:employees) {
			System.out.println(employee);
		}
		session.close();

	}
}
