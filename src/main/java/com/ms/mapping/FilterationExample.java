package com.ms.mapping;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import com.ms.Utility;

public class FilterationExample {

	public static void main(String[] args) {
		
		Session session=Utility.getSessionFactory().openSession();
		Criteria criteria=session.createCriteria(Emp.class);
		criteria.createAlias("accounts", "account");
		criteria.add(Restrictions.eq("account.branch", "bhopal"));
		List<Emp> emps=criteria.list();
		for(Emp emp:emps) {
			System.out.println(emp.getEno()+","+emp.getName()+","+emp.getSalary());	
			List<Account> accounts=emp.getAccounts();
			System.out.println("Account Details : ");
			for(Account account:accounts) {
				System.out.println(account.getAno()+","+account.getBank()+","+account.getBranch());
			}
			System.out.println("___________________________________________________________");
		}
		/*
		//criteria.add(Restrictions.gt("salary", 50000));
		criteria.createAlias("laptop", "lapy");
		criteria.add(Restrictions.lt("lapy.price", 60000));
		List<Emp> emps=criteria.list();
		for(Emp emp:emps) {
			System.out.println(emp.getName()+","+emp.getSalary()+","+emp.getLaptop().getLcode()+","+emp.getLaptop().getBrand()+","+emp.getLaptop().getPrice());
		}
		*/
		session.close();
	}

}
