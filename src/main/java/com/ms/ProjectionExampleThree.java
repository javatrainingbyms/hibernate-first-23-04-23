package com.ms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class ProjectionExampleThree {

	public static void main(String[] args) {
		//here we will project more than one column (empname,salary)
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		
		Projection proj1=Projections.property("empname");
		Projection proj2=Projections.property("salary");
		
		ProjectionList pList=Projections.projectionList();
		pList.add(proj1); pList.add(proj2);
		
		criteria.setProjection(pList);
		
		List<Object[]> list=criteria.list();
		
		for(Object ar[]:list) {
			for(Object item:ar) {
				System.out.println(item);
			}
			System.out.println("------------------------------------");
		}
		
		session.close();

	}

}
