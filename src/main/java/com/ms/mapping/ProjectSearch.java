package com.ms.mapping;

import java.util.List;

import org.hibernate.Session;

import com.ms.Utility;

public class ProjectSearch {

	public static void main(String[] args) {

		Session session = Utility.getSessionFactory().openSession();
		Project project = session.get(Project.class, "p3");
		System.out.println(project.getPcode());
		System.out.println(project.getPname());
		System.out.println(project.getCname());
		List<Emp> emps = project.getEmps();
		for (Emp emp : emps) {
			System.out.println(emp.getEno()+","+emp.getName()+","+emp.getSalary());
		}
		session.close();

	}

}
