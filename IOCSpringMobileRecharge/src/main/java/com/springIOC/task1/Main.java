package com.springIOC.task1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext appc = new ClassPathXmlApplicationContext("di.cfg.xml");
//		Recharge r1 = (Recharge)appc.getBean("r1");
//		System.out.println(r1);
		
		Mobile m1 = (Mobile)appc.getBean("m1");
		System.out.println(m1.getModelName());
		System.out.println(m1.getRecharge());
		
		Mobile m2 = (Mobile)appc.getBean("m2");
		System.out.println(m2.getModelName());
		System.out.println(m2.getRecharge());
		
	}
}
