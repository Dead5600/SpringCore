package com.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Friends {

	private List<String> bestFriends;
	private Set<String> teacher;
	private Map<String, Integer> feestructure;
	private Properties jdbc;
	
	public Friends(List<String> bestFriends, Set<String> teacher, Map<String, Integer> feestructure, Properties jdbc) {
		super();
		this.bestFriends = bestFriends;
		this.teacher = teacher;
		this.feestructure = feestructure;
		this.jdbc = jdbc;
	}

	@Override
	public String toString() {
		return "Friends [bestFriends=" + bestFriends + ", teacher=" + teacher + ", feestructure=" + feestructure
				+ ", jdbc=" + jdbc + "]";
	}

	public List<String> getBestFriends() {
		return bestFriends;
	}

	public void setBestFriends(List<String> bestFriends) {
		this.bestFriends = bestFriends;
	}

	public Set<String> getTeacher() {
		return teacher;
	}

	public void setTeacher(Set<String> teacher) {
		this.teacher = teacher;
	}

	public Map<String, Integer> getFeestructure() {
		return feestructure;
	}

	public void setFeestructure(Map<String, Integer> feestructure) {
		this.feestructure = feestructure;
	}

	public Properties getJdbc() {
		return jdbc;
	}

	public void setJdbc(Properties jdbc) {
		this.jdbc = jdbc;
	}

	public Friends() {
		// TODO Auto-generated constructor stub
	}

}
