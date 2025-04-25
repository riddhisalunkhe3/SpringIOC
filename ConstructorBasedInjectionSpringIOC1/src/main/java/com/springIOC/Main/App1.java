package com.springIOC.Main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springIOC.bookDetails.Book;
public class App1 {
	public static void main(String[] args) {
		Session s = new Configuration().configure().buildSessionFactory().openSession();
		Transaction tx = s.beginTransaction();
		ApplicationContext appc = new ClassPathXmlApplicationContext("NewFile1.xml");
		Book b = (Book)appc.getBean("book1");
		System.out.println(b);
		s.save(b);
		tx.commit();
		s.close();
	}
}
