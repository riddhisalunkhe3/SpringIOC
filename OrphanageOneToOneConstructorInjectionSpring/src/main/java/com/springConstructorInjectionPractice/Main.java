package com.springConstructorInjectionPractice;

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
		Orphanage o1 = (Orphanage)appc.getBean("o1");
		Orphanage o2 = (Orphanage)appc.getBean("o2");
		Orphanage o3 = (Orphanage)appc.getBean("o3");
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o3);
		
		for(Person p : o1.getPerson())
		{
			s.save(p);
		}
		s.save(o1);
		for(Person p : o2.getPerson())
		{
			s.save(p);
		}
		s.save(o2);
		for(Person p : o3.getPerson())
		{
			s.save(p);
		}
		s.save(o3);
		tx.commit();
		s.close();
		
	}
}
