package com.bean;

import java.util.Map;

public class Manager {

	Map<Object, Object> map;

	public Map<Object, Object> getMap() {
		return map;
	}

	public void setMap(Map<Object, Object> map) {
		this.map = map;
	}
	public String toString() {
		return "map : "+map;
	}
	
}
