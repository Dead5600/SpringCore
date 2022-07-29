package com.autowire.xml;

public class Employee {

	private String name;
	private Company comp;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", comp=" + comp + "]";
	}

	public Employee(String name, Company comp) {
		super();
		this.name = name;
		this.comp = comp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Company getComp() {
		return comp;
	}

	public void setComp(Company comp) {
		this.comp = comp;
	}
	
	

}
