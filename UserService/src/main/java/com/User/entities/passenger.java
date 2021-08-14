package com.User.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String phNo;
	private int age;

	
	


	public passenger(int id, String name, String phNo, int age) {
		super();
		this.id = id;
		this.name = name;
		this.phNo = phNo;
		this.age = age;
	}





	@Override
	public String toString() {
		return "passenger [id=" + id + ", name=" + name + ", phNo=" + phNo + ", age=" + age + "]";
	}





	public int getId() {
		return id;
	}





	public void setId(int id) {
		this.id = id;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getPhNo() {
		return phNo;
	}





	public void setPhNo(String phNo) {
		this.phNo = phNo;
	}





	public int getAge() {
		return age;
	}





	public void setAge(int age) {
		this.age = age;
	}





	public passenger() {
		
		
	}
	
	
	

}
