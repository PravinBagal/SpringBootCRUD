package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int rollno;
	private String sname;
	private String saddress;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public Student(int rollno, String sname, String saddress) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.saddress = saddress;
	}
	public Student() {
		
	}
	

}
