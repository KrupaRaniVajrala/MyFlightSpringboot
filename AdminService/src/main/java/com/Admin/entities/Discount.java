package com.Admin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Discount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String code;
	private int percentage;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public int getPercentage() {
		return percentage;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	
	public Discount(int id, String code, int percentage) {
		super();
		this.id = id;
		code = code;
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Discount [id=" + id + ", code=" + code + ", percentage=" + percentage + "]";
	}
	public Discount() {
		super();
		
	}
	
	
	
}
