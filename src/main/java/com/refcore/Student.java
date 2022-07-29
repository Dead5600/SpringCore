package com.refcore;

public class Student {
	
	private int stdId;
	private String name;
	private College clg;
	
	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
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

	public Student(int stdId, String name, College clg) {
		super();
		this.stdId = stdId;
		this.name = name;
		this.clg = clg;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", name=" + name + ", clg=" + clg + "]";
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

}
