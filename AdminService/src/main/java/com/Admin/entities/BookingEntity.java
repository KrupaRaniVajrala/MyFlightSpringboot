package com.Admin.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class BookingEntity {
	
	private int id;
	private String name;
	private String phNo;
	private int age;
	private String fromLoc;
	private String toLoc;
	private String date;
	private String flightNumber;
	private String onwardDate;
	private String returnDate;
	private String booker;
	private long price;
	private String pnr;
	
	
	
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
	
	
	public String getFlightNumber() {
		return flightNumber;
	}
	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFromLoc() {
		return fromLoc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getOnwardDate() {
		return onwardDate;
	}
	public void setOnwardDate(String onwardDate) {
		this.onwardDate = onwardDate;
	}
	public String getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	public String getBooker() {
		return booker;
	}
	public void setBooker(String booker) {
		this.booker = booker;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public String getPnr() {
		return pnr;
	}
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	public void setFromLoc(String fromLoc) {
		this.fromLoc = fromLoc;
	}
	public String getToLoc() {
		return toLoc;
	}
	public void setToLoc(String toLoc) {
		this.toLoc = toLoc;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
	public BookingEntity() {
				
	}
	public BookingEntity(int id, String name, String phNo, int age, String fromLoc, String toLoc, String date,
			String flightNumber, String onwardDate, String returnDate, String booker, long price, String pnr) {
		super();
		this.id = id;
		this.name = name;
		this.phNo = phNo;
		this.age = age;
		this.fromLoc = fromLoc;
		this.toLoc = toLoc;
		this.date = date;
		this.flightNumber = flightNumber;
		this.onwardDate = onwardDate;
		this.returnDate = returnDate;
		this.booker = booker;
		this.price = price;
		this.pnr = pnr;
	}
	@Override
	public String toString() {
		return "BookingEntity [id=" + id + ", name=" + name + ", phNo=" + phNo + ", age=" + age + ", fromLoc=" + fromLoc
				+ ", toLoc=" + toLoc + ", date=" + date + ", flightNumber=" + flightNumber + ", onwardDate="
				+ onwardDate + ", returnDate=" + returnDate + ", booker=" + booker + ", price=" + price + ", pnr=" + pnr
				+ "]";
	}
}
