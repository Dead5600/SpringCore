package com.standalone;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con = new ClassPathXmlApplicationContext("com/standalone/alone.xml");
		Friends f1=con.getBean("friend", Friends.class);
		System.out.println(f1.getBestFriends());
		System.out.println(f1.getFeestructure());
		System.out.println(f1.getJdbc());
		System.out.println(f1.getTeacher());
	}

}
