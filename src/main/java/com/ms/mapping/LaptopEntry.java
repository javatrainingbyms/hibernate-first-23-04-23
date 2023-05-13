package com.ms.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class LaptopEntry {

	public static void main(String[] args) {
		Laptop l1=new Laptop("L1","Dell",45000);
		Laptop l2=new Laptop("L2","HP",47000);
		Laptop l3=new Laptop("L3","Mac",95000);
		
		Configuration config=new Configuration().configure();//hibernate.cfg.xml
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();	//connection obtain
		
		Transaction tr=session.beginTransaction();
		session.save(l1); 
		session.save(l2); 
		session.save(l3); 

		tr.commit();
		session.close();
		
		System.out.println("Laptop Data Stored Successfully....");

	}

}
