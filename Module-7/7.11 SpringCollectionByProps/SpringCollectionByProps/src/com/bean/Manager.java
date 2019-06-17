package com.bean;

import java.util.Properties;

public class Manager {

	Properties props;

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}
	
	public String toString() {
		return "Property : "+props;
	}
	
}
