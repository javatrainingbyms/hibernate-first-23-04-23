package com.ms;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Utility {
	public static SessionFactory getSessionFactory() {
		Configuration config=new Configuration().configure();//hibernate.cfg.xml
		SessionFactory sf=config.buildSessionFactory();
		return sf;		
	}
}
