package com.ms.mapping;

import java.util.List;

import org.hibernate.Session;

import com.ms.Utility;

public class EmpSearch {

	public static void main(String[] args) {
		Session session=Utility.getSessionFactory().openSession();
		Emp emp=session.get(Emp.class, 101);
		System.out.println(emp.getEno());
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
		Laptop laptop=emp.getLaptop();	//here a select from laptop will run
		System.out.println(laptop.getLcode());
		System.out.println(laptop.getBrand());
		System.out.println(laptop.getPrice());
		
		List<Account> accounts=emp.getAccounts();
		for(Account account:accounts) {
			System.out.println(account.getAno()+","+account.getBank()+","+account.getBranch());
		}
		
		session.close();

	}

}
