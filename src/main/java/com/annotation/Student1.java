package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("firststd")
public class Student1 {
	
	@Value("123")
	private int id;
	
	@Value("#{new java.lang.String('Prathamesh Patil')}")
	private String name;
	
	@Autowired
	private College clg;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", clg=" + clg + "]";
	}

	public Student1(int id, String name, College clg) {
		super();
		this.id = id;
		this.name = name;
		this.clg = clg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public College getClg() {
		return clg;
	}

	public void setClg(College clg) {
		this.clg = clg;
	}

	public Student1() {
		// TODO Auto-generated constructor stub
	}

	public void study() {
		System.out.println("student is studying");
	}
}
