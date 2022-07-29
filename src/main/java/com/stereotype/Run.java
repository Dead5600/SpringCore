package com.stereotype;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Run {

	public static void main(String[] args) {
		
		ApplicationContext con = new ClassPathXmlApplicationContext("com/stereotype/StereoConfig.xml");
		Student std = con.getBean("s1",Student.class);
		System.out.println(std);
		
		System.out.println(std.getFriends());
		System.out.println(std.getFriends().getClass().getName());
		
		Student std1 = con.getBean("s1",Student.class);
		System.out.println(std.hashCode());
		System.out.println(std1.hashCode());
		
	}
}
