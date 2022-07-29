package com.annotation;

import org.springframework.stereotype.Component;

@Component("college1")
public class College {

	public College() {
		// TODO Auto-generated constructor stub
	}
	public void teacher() {
		System.out.println("inside teacher method");
		
	}

}
