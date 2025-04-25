package com.springIOC.Task;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void getBird()
	{
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		Bird b = s.get(Bird.class, 1);
		System.out.println(b);
	}
	public static void main(String[] args) {
		Session s = new Configuration().configure("Hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		ApplicationContext appc = new ClassPathXmlApplicationContext("di.cfg.xml");
		Bird b1 = (Bird)appc.getBean("b1");
		for(Tree t1 : b1.getTrees())
		{
			s.save(t1);
		}
		s.save(b1);
		tx.commit();
		s.close();
		
		//getBird();
		
	}
}
