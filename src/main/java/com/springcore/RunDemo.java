package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Programmer");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/Config.xml");
		Student s1 = context.getBean("std1", Student.class);
		Student s2 = context.getBean("std2", Student.class);
		System.out.println(s1);
		System.out.println(s2);

		Student s3 = context.getBean("std1", Student.class);
		Student s4 = context.getBean("std2", Student.class);
		
		System.out.println("\n......prototype.......");
		System.out.println(s1.hashCode());
		System.out.println(s3.hashCode());
		System.out.println("\n......Singleton.......");
		System.out.println(s2.hashCode());
		System.out.println(s4.hashCode());
	}

}
