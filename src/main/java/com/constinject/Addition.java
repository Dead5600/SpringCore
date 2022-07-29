package com.constinject;

public class Addition {
	
	private int a;
	private int b;
	
	public void doAdd() {
			System.out.println("Sum of two numbers = "+(this.a+this.b));
		}
	
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

		@Override
	public String toString() {
		return "Addition [a=" + a + ", b=" + b + "]";
	}
	
	/* 1) if we define type in the configuration file then it will execute as it is 
	   2) if we didn't specify the type of value then it will execute as the order of code 
	   3)if there is present of string constructor then it will execute String constructor 
	   because the value is default type */ 
		
	public Addition(int a, int b) {
		super();
		System.out.println("int, int");
		this.a = a;
		this.b = b;
	}
		

	public Addition(long a, int b) {
		super();
		System.out.println("long, int");
		this.a = (int)a;
		this.b = b;
	}

	public Addition(String a, String b) {
			super();
			this.a = Integer.parseInt(a);
			this.b = Integer.parseInt(b);
			System.out.println("String , String");
		}


	public Addition() {
		// TODO Auto-generated constructor stub
	}

}
