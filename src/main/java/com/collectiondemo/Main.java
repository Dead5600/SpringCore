package com.collectiondemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Started the collection");
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/collectiondemo/Collection.cfg.xml");
		Employee e1 = con.getBean("emp1", Employee.class);
		Employee e2 = con.getBean("emp2", Employee.class);
		System.out.println(e1);
		System.out.println(e2);

		System.out.println(".....Ended......");
	}

}
