package com.context.task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext appc = new ClassPathXmlApplicationContext("Container.xml");
		Vehicle pulser = (Vehicle)appc.getBean("pulser");
		System.out.println(pulser);
	}
}
