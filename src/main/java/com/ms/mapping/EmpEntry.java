package com.ms.mapping;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpEntry {

	public static void main(String[] args) {
		
		Emp e1=new Emp(101,"abc",50000,new Laptop("L1")); 
		Emp e2=new Emp(102,"xyz",60000,new Laptop("L2")); 
		Emp e3=new Emp(103,"pqr",70000,new Laptop("L3")); 
		
		Configuration config=new Configuration().configure();//hibernate.cfg.xml
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();	//connection obtain
		
		Transaction tr=session.beginTransaction();
		session.save(e1); 
		session.save(e2); 
		session.save(e3); 

		tr.commit();
		session.close();
		
		System.out.println("Emp Data Stored Successfully....");

	}

}
