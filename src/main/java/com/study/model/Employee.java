package com.study.model;

public class Employee {
	
	private String name;
	private String aadhar;

	public Employee(String string, String string2) {
		this.name = string;
		this.aadhar = string2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	
	

}
