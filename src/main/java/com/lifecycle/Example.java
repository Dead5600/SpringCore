package com.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {

	private String Subject;
	
	public Example(String subject) {
		super();
		Subject = subject;
	}

	@Override
	public String toString() {
		return "Example [Subject=" + Subject + "]";
	}

	public String getSubject() {
		return Subject;
	}

	public void setSubject(String subject) {
		System.out.println("Setting properties of Example class");
		Subject = subject;
	}

	public Example() {
		// TODO Auto-generated constructor stub
	}
	@PostConstruct
	public void start() {
		System.out.println("Inside start method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Inside end method");
	}

}
