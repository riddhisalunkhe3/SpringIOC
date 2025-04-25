package com.springIOC.Task;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		ApplicationContext appc =new ClassPathXmlApplicationContext("di.cfg.xml");
//		Tree t1 = (Tree)appc.getBean("t1");
//		System.out.println(t1);
//		Tree t2 = (Tree)appc.getBean("t2");
//		System.out.println(t2);
//		Tree t3 = (Tree)appc.getBean("t3");
//		System.out.println(t3);
		
		Bird b1 = (Bird)appc.getBean("b1");
		Bird b2 = (Bird)appc.getBean("b2");
		Bird b3 = (Bird)appc.getBean("b3");
		Bird b4 = (Bird)appc.getBean("b4");
		Bird b5 = (Bird)appc.getBean("b5");
		Bird b6 = (Bird)appc.getBean("b6");
		s.save(b1);
		s.save(b2);
		s.save(b3);
		s.save(b4);
		s.save(b5);
		s.save(b6);
		tx.commit();
		s.close();
	}
}
