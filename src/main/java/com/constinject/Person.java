package com.constinject;

import java.util.List;

public class Person {

	private int personid;
	private String personName;
	private Course course;
	private List<String> address;

	public Person(int personid, String personName, Course course, List<String> address) {
		super();
		this.personid = personid;
		this.personName = personName;
		this.course = course;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [personid=" + personid + ", personName=" + personName + ", course=" + course + ", address="
				+ address + "]";
	}

	public int getPersonid() {
		return personid;
	}

	public void setPersonid(int personid) {
		this.personid = personid;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public Person() {
		// TODO Auto-generated constructor stub
	}

}
