package com.springIOCPractice;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
	public static void main(String[] args) {
		Session s = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		ApplicationContext appc = new ClassPathXmlApplicationContext("Container.xml");
		
		College c = (College)appc.getBean("AGCE");
		System.out.println(c);
		s.save(c);
		tx.commit();
		s.close();
	}
}
