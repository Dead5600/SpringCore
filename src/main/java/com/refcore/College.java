package com.refcore;

public class College {
	
	private int clgid;
	private String clgname;
	
	public College(int clgid, String clgname) {
		super();
		this.clgid = clgid;
		this.clgname = clgname;
	}

	@Override
	public String toString() {
		return "College [clgid=" + clgid + ", clgname=" + clgname + "]";
	}

	public int getClgid() {
		return clgid;
	}

	public void setClgid(int clgid) {
		this.clgid = clgid;
	}

	public String getClgname() {
		return clgname;
	}

	public void setClgname(String clgname) {
		this.clgname = clgname;
	}

	public College() {
		// TODO Auto-generated constructor stub
	}

}
