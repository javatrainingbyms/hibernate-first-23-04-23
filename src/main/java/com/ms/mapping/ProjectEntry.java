package com.ms.mapping;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ProjectEntry {

	public static void main(String[] args) {
		
		Emp e1=new Emp(101); 
		Emp e2=new Emp(102); 
		Emp e3=new Emp(103);
		
		List<Emp> list1=Arrays.asList(e1,e2);
		List<Emp> list2=Arrays.asList(e2,e3);
		List<Emp> list3=Arrays.asList(e1,e3);
		
		Project p1=new Project("p1","HDesk","Bajaj",list1);
		Project p2=new Project("p2","ActSys","Tata",list2);
		Project p3=new Project("p3","BnkSys","SBI",list3);
		
		Configuration config=new Configuration().configure();//hibernate.cfg.xml
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();	//connection obtain
		
		Transaction tr=session.beginTransaction();
		session.save(p1); 
		session.save(p2); 
		session.save(p3); 

		tr.commit();
		session.close();
		
		System.out.println("Project Data Stored Successfully....");

	}

}
