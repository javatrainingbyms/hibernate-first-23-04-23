package com.ms;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpEntry {

	public static void main(String[] args) {
		Employee e1=new Employee("rakesh","se",40000);
		Employee e2=new Employee("sumit","sse",60000);
		Employee e3=new Employee("john","se",50000);
		Employee e4=new Employee("smith","sse",55000);
		Employee e5=new Employee("priya","tl",90000);
		
		Configuration config=new Configuration().configure();//hibernate.cfg.xml
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();	//connection obtain
		
		Transaction tr=session.beginTransaction();
		session.save(e1); 
		session.save(e2); 
		session.save(e3); 
		session.save(e4); 
		session.save(e5);
		tr.commit();
		session.close();
		
		System.out.println("Data Stored Successfully....");
		
	}

}
