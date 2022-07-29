package com.springcore;

public class Student {
	
	private int id;
	private String name;
	private String Address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("Setting id");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setting name");
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		System.out.println("Setting Address");
		Address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Address=" + Address + "]";
	}
	public Student(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		Address = address;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
