package com.ms;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;

public class HQLReading {

	public static void main(String[] args) {
		 //create the session object
		Session session=Utility.getSessionFactory().openSession();
		String hql="FROM Employee WHERE designation='sse' ORDER BY salary desc";
		//To run hql create a Query object
		Query query=session.createQuery(hql);
		
		//call the list method for a SELECT 
		List<Employee> employees=query.list();
		for(Employee emp:employees) {
			System.out.println(emp);
		}
		session.close();
	}

}
