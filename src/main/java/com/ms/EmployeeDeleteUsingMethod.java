package com.ms;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmployeeDeleteUsingMethod {
	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Employee emp=session.get(Employee.class, 4001);
		Transaction tr=session.beginTransaction();
		session.delete(emp);
		tr.commit();
		session.close();
		System.out.println("data deleted...");
	}

}
