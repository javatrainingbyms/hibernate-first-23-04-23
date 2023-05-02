package com.ms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class ProjectionExampleOne {

	public static void main(String[] args) {
		//in this example we will fetch names of all the employees.
		
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		
		Projection proj1=Projections.property("empname");
		criteria.setProjection(proj1);
		
		List<String> names=criteria.list();
		
		for(String name:names) {
			System.out.println(name);
		}
		
		session.close();
	}

}
