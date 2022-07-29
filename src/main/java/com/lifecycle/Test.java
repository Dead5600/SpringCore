package com.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/lifecycle/Lifecycle.xml");
		// registering shutdown hook is mandatory to call the destroy method explicitly
		context.registerShutdownHook();

//		Institute i1 = context.getBean("inst", Institute.class);
//		System.out.println(i1);
//
//		System.out.println("...................................................................");
//
//		Teacher t1 = context.getBean("Teach", Teacher.class);
//		System.out.println(t1);
		
		Example e1 = context.getBean("eg" , Example.class);
		System.out.println(e1);
		
	}

}
