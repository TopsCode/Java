package com.bean;

import java.util.List;
import java.util.Set;

public class Student {

	private Set<Object> set;

	public Set<Object> getSet() {
		return set;
	}

	public void setSet(Set<Object> set) {
		this.set = set;
	}
	
	public String toString() {
		return "Set : "+set;
	}
	
}
