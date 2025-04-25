package com.springIOC.Main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springIOC.bookDetails.Book;

public class App {
	public static void main(String[] args) {
		ApplicationContext appc = new ClassPathXmlApplicationContext("NewFile.xml");
		Book b = (Book)appc.getBean("book1");
		System.out.println(b);
	}
}
