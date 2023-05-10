package com.ms;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpUpdateUsingMethod {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Employee emp=session.get(Employee.class, 4001);
		emp.setDesignation("manager");
		emp.setSalary(95000);
		Transaction tr=session.beginTransaction();
		session.update(emp);//update command where eno=?
		tr.commit();
		session.close();
		System.out.println("data modified...");
	}

}
