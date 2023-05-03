package com.ms;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;

public class ProjectionExampleSix {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		Projection proj1=Projections.groupProperty("designation");
		Projection proj2=Projections.sum("salary");
		Projection proj3=Projections.avg("salary");
		Projection proj4=Projections.max("salary");
		Projection proj5=Projections.min("salary");
		Projection proj6=Projections.count("salary");
		
		ProjectionList pList=Projections.projectionList();
		pList.add(proj1,"desg");
		pList.add(proj2,"sum");
		pList.add(proj3,"avg");
		pList.add(proj4,"max");
		pList.add(proj5,"min");
		pList.add(proj6,"count");
		
		criteria.setProjection(pList);
		criteria.setResultTransformer(Transformers.aliasToBean(Summary.class));
		List<Summary> list=criteria.list();
		for(Summary summary:list) {
			System.out.println(summary);
		}
		/*
		criteria.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		List<Map> list=criteria.list();
		
		for(Map map:list) {
			System.out.println(map);
		}
		*/
		session.close();

		
		
		
		
		
		
	}

}
