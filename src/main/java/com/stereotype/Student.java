package com.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("s1")		// @Component is used to define bean
//Singleton -- it is default scope and create object only one time and give reference of he existed object  to the newly created object
//prototype -- It will create new object every time .
@Scope("prototype")		
public class Student {
	
	@Value("45567") // Setting the value to the fields
	private int id;
	
	@Value("Rohit Patil")
	private String stdName;
	
	@Value("Kolhapur")
	private String city;
	
	// @Value on Collection fields
	@Value("#{list1}")		// using Spring Expression Language
	private List<String> friends;

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", stdName=" + stdName + ", city=" + city + ", friends=" + friends + "]";
	}

	public Student(int id, String stdName, String city, List<String> friends) {
		super();
		this.id = id;
		this.stdName = stdName;
		this.city = city;
		this.friends = friends;
	}


	
	

}
