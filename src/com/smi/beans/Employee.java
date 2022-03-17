package com.smi.beans;
import java.lang.Integer;
public class Employee {

	private int eid;
	private String name;
	private String dept;
	private String desig;
	
	public Employee() {
		//contructor
	}

	public Employee(int eid, String name, String dept, String desig) {
		super();
		this.eid = eid;
		this.name = name;
		this.dept = dept;
		this.desig = desig;
	}

	public int geteid() {
		return eid;
	}

	public void seteid(int eid) {
		this.eid = eid;
	}

	public String getname() {
		return name;
	}

	public void setname(String name) {
		this.name = name;
	}

	public String getdept() {
		return dept;
	}

	public void setdept(String dept) {
		this.dept = dept;
	}

	public String getdesig() {
		return desig;
	}

	public void setdesig(String desig) {
		this.desig = desig;
	}
	
	
	
}
