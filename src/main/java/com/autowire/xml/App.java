package com.autowire.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con = new ClassPathXmlApplicationContext("com/autowire/xml/autoxmlcfg.xml");
		Employee e1 =con.getBean("emp1",Employee.class);
		
		System.out.println(e1);
	}

}
