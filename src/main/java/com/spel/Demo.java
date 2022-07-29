package com.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/spel/spelconfig.xml");
		TestSpel t1 = con.getBean("testSpel",TestSpel.class);
		System.out.println(t1);
		System.out.println(t1.getName());
		System.out.println(t1.getP());
		System.out.println(t1.getX());
		System.out.println(t1.getY());
		System.out.println(t1.getZ());
		System.out.println(t1.isActive());
		
		

	}

}
