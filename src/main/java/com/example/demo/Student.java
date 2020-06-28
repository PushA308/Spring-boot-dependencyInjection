package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	private int sid;
	private String sname;
	private String technology;
	@Autowired
	private Laptop laptop;

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Student() {
		super();
		System.out.println("object created");
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setTechnology(String technology) {
		this.technology = technology;
	}
	
	public void show() {
		System.out.println("in student class show");
		laptop.compile();
	}

}
