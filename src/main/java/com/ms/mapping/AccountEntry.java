package com.ms.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AccountEntry {

	public static void main(String[] args) {
		Account ac1=new Account("a101","sbi","indore", new Emp(101));
		Account ac2=new Account("a102","hdfc","bhopal", new Emp(101));
		Account ac3=new Account("a103","axis","indore", new Emp(102));
		Account ac4=new Account("a104","icici","delhi", new Emp(102));
		Account ac5=new Account("a105","bob","bhopal", new Emp(102));
		Account ac6=new Account("a106","boi","mumbai", new Emp(103));
		
		
		Configuration config=new Configuration().configure();//hibernate.cfg.xml
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();	//connection obtain
		
		Transaction tr=session.beginTransaction();
		session.save(ac1); session.save(ac2); 
		session.save(ac3); session.save(ac4);
		session.save(ac5); session.save(ac6);

		tr.commit();
		session.close();
		
		System.out.println("Account Data Stored Successfully....");

	}

}
