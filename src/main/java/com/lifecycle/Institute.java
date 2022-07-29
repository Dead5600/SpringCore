package com.lifecycle;

public class Institute {

	private int InstId;
	private String InstName;
	
	
	@Override
	public String toString() {
		return "Institute [InstId=" + InstId + ", InstName=" + InstName + "]";
	}

	public Institute() {
		// TODO Auto-generated constructor stub
	}

	public int getInstId() {
		return InstId;
	}

	public void setInstId(int instId) {
		System.out.println("setting the propperties");
		InstId = instId;
	}

	public String getInstName() {
		return InstName;
	}

	public void setInstName(String instName) {
		InstName = instName;
	}

	public Institute(int instId, String instName) {
		super();
		InstId = instId;
		InstName = instName;
	}

	public void init() {
		System.out.println("Inside the init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
}
