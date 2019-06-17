package com.bean;

public class Employee {

	private String empname, empaddress;
	private String Phone;

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getEmpaddress() {
		return empaddress;
	}

	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}

	public String getPhone() {
		return Phone;
	}

	public void setPhone(String phone) {
		Phone = phone;
	}

	public String toString() {
		return "Pname : " + empname + " Paddress : " + empaddress + " phone : " + Phone;
	}

}
