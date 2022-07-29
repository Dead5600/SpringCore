package com.annotation;

import org.springframework.stereotype.Component;

@Component("std")
public class Student {

	public void study() {
		System.out.println("inside study");
		
	}
}
