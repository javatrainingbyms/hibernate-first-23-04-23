package com.ms.mapping;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmpEntry {

	public static void main(String[] args) {
		Account ac1=new Account("a101");
		Account ac2=new Account("a102");
		Account ac3=new Account("a103");
		Account ac4=new Account("a104");
		Account ac5=new Account("a105");
		Account ac6=new Account("a106");
		List<Account> list1=Arrays.asList(ac1,ac2);
		List<Account> list2=Arrays.asList(ac3,ac4,ac5);
		List<Account> list3=Arrays.asList(ac6);
		Emp e1=new Emp(101,"abc",50000,new Laptop("L1")); e1.setAccounts(list1);
		Emp e2=new Emp(102,"xyz",60000,new Laptop("L2")); e2.setAccounts(list2);
		Emp e3=new Emp(103,"pqr",70000,new Laptop("L3")); e3.setAccounts(list3);
		
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
