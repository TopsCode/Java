package com.Bean;

import java.util.List;

public class CustomerBean {

	private List<Object> list;

	public List<Object> getList() {
		return list;
	}

	public void setList(List<Object> list) {
		this.list = list;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "List : "+list;
	}
}
