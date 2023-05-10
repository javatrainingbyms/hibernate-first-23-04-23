package com.ms;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class HQLUpdate {

	public static void main(String[] args) {
		String hql="UPDATE Employee SET salary=salary+1000 WHERE designation='sse'";
		Session session=Utility.getSessionFactory().openSession();
		Query query=session.createQuery(hql);
		Transaction tr=session.beginTransaction();
		int n=query.executeUpdate();
		tr.commit();
		System.out.println("no of rows modified : "+n);
		session.close();

	}

}
