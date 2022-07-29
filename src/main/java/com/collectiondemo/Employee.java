package com.collectiondemo;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {

	private int empid;
	private String empName;
	private List<String> phones;
	private Set<String> address;
	private Map<String, String> Courses;
	private Properties jdbc;
	
	public Properties getJdbc() {
		return jdbc;
	}
	
	public void setJdbc(Properties jdbc) {
		this.jdbc = jdbc;
	}
	
	public int getEmpid() {
		return empid;
	}
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public List<String> getPhones() {
		return phones;
	}
	
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	
	public Set<String> getAddress() {
		return address;
	}
	
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	
	public Map<String, String> getCourses() {
		return Courses;
	}
	
	public void setCourses(Map<String, String> courses) {
		Courses = courses;
	}
	
	public Employee(int empid, String empName, List<String> phones, Set<String> address, Map<String, String> courses,
			Properties jdbc) {
		super();
		this.empid = empid;
		this.empName = empName;
		this.phones = phones;
		this.address = address;
		Courses = courses;
		this.jdbc = jdbc;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", phones=" + phones + ", address=" + address
				+ ", Courses=" + Courses + ", jdbc=" + jdbc + "]";
	}
	
	
	
	
	
	

}
