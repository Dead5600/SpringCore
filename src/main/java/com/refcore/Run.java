package com.refcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/refcore/RefConfig.xml");
			Student s1= con.getBean("std", Student.class);
			Student s2 = con.getBean("std2",Student.class);
			System.out.println("Student name "+"\t collegename");		
		System.out.println(s1.getName()+" \t"+s1.getClg().getClgname());
		System.out.println(s2.getName()+" \t"+s2.getClg().getClgname());

	}

}
