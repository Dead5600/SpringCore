package com.constinject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/constinject/Coninject.xml");
			Person p1 =con.getBean("per1",Person.class);
			System.out.println(p1);
			
		Addition a1 = con.getBean("add", Addition.class);
		System.out.println(a1);
		a1.doAdd();

	}

}
