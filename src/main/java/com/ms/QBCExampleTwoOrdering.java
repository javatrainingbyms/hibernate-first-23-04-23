package com.ms;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Order;

public class QBCExampleTwoOrdering {
	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Employee.class);
		
		//Order order1=Order.asc("salary");
		//criteria.addOrder(order1);
		//Order order2=Order.asc("designation");
		//criteria.addOrder(order2);
		criteria.addOrder(Order.desc("salary"));
		criteria.addOrder(Order.asc("designation"));
		List<Employee> employees=criteria.list();	
		for(Employee employee:employees) {
			System.out.println(employee);
		}
		session.close();
	}
}
