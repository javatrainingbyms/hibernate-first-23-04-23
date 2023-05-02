package com.ms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

public class ProjectionExampleTwo {

	public static void main(String[] args) {
		//in this example we will fetch codes of all the employees.
		
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		
		Projection proj1=Projections.property("eno");
		criteria.setProjection(proj1);
		
		List<Integer> enos=criteria.list();
		
		for(Integer eno:enos) {
			System.out.println(eno);
		}
		
		session.close();
	}

}
