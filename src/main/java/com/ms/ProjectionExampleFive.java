package com.ms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;

public class ProjectionExampleFive {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		
		Projection proj1=Projections.property("empname");
		Projection proj2=Projections.property("salary");
		
		ProjectionList pList=Projections.projectionList();
	
		pList.add(proj1,"name");	//alias	(as a key for map)
		pList.add(proj2,"pay");		//alias
		
		criteria.setProjection(pList);
		
		
		
		
		criteria.setResultTransformer(Transformers.aliasToBean(EmpInfo.class));
		
		List<EmpInfo> list=criteria.list();
		for(EmpInfo info:list) {
			System.out.println(info);
		}
		
		session.close();
	}

}
