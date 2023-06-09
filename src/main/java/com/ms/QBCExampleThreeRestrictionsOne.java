package com.ms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class QBCExampleThreeRestrictionsOne {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		
		Criterion crt1=Restrictions.ge("salary", 50000);	//salary>50000
		Criterion crt2=Restrictions.eq("designation", "se");
		
		//Criterion crt3=Restrictions.or(crt1,crt2);
		Criterion crt3=Restrictions.and(crt1,crt2);
		//criteria.add(crt1);
		//criteria.add(crt2);
		criteria.add(crt3);
		List<Employee> employees=criteria.list();	
		for(Employee employee:employees) {
			System.out.println(employee);
		}
		session.close();

	}

}
