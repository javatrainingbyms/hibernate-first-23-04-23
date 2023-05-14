package com.ms.mapping;

import java.util.List;

import org.hibernate.Session;

import com.ms.Utility;

public class AccountSearch {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Account account=session.get(Account.class, "a101");
		System.out.println(account.getAno());
		System.out.println(account.getBank());
		System.out.println(account.getBranch());
		Emp emp=account.getEmp();
		
		System.out.println(emp.getEno());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
		
		
		session.close();

	}

}
