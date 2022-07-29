package com.autowire.xml;

public class Company {
	
	private int id;
	private String compName;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCompName() {
		return compName;
	}


	public void setCompName(String compName) {
		this.compName = compName;
	}


	public Company() {
		// TODO Auto-generated constructor stub
	}


	public Company(int id, String compName) {
		super();
		this.id = id;
		this.compName = compName;
	}


	@Override
	public String toString() {
		return "Company [id=" + id + ", compName=" + compName + "]";
	}
	

}
