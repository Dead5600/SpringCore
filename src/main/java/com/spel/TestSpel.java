package com.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestSpel {
	
	// setting primitive
	@Value("#{23+43}")
	private int x;
	
	// setting expression
	@Value("#{10>12?99:55}")
	private int y;
	
	// setting static method
	@Value("#{T(java.lang.Math).sqrt(100)}")
	private double z;
	
	// setting static variables
	@Value("#{T(java.lang.Math).PI}")
	private double p;
	
	// setting object 
	@Value("{new java.lang.String('Prathamesh Patil')")
	private String name;
	// setting boolean value to the fields
	@Value("#{10*2>5*3}")
	private boolean isActive;
	
	@Override
	public String toString() {
		return "TestSpel [x=" + x + ", y=" + y + ", z=" + z + ", p=" + p + ", name=" + name + ", isActive=" + isActive
				+ "]";
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public TestSpel() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getP() {
		return p;
	}

	public void setP(double p) {
		this.p = p;
	}

}
