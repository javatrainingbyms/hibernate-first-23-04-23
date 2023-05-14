package com.ms.mapping;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.transform.Transformers;

import com.ms.Utility;

public class ProjectionExample {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Emp.class);
		criteria.createAlias("laptop", "laptop");
		ProjectionList pList=Projections.projectionList();
		pList.add(Projections.property("name"), "name");
		pList.add(Projections.property("laptop.brand"),"brand");
		criteria.setProjection(pList);
		criteria.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		List<Map> list=criteria.list();
		for(Map map:list) {
			System.out.println(map);
		}
		session.close();
	}

}
