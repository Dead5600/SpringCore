package com.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		//ApplicationContext con = new ClassPathXmlApplicationContext("com/annotation/Config.xml");
		ApplicationContext con = new AnnotationConfigApplicationContext(Configure.class);				
			Student1 s1 = con.getBean("firststd", Student1.class);
		//	s1.study();
			System.out.println(s1);
			System.out.println(s1.getName());
			System.out.println(s1.getClg());
	}

}
