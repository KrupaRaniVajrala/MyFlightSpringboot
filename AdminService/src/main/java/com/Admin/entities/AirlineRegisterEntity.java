package com.Admin.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class AirlineRegisterEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	 
	private String name;
	private long contactNumber;
	private String Address;
	
//	@OneToMany(mappedBy = "arentity",fetch = FetchType.LAZY,cascade = CascadeType.ALL,orphanRemoval = true)
//	@JsonIgnoreProperties("arentity")
	
//	private List<FlightEntity> fentity;
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "AirlineRegisterEntity [id=" + id + ", name=" + name + ", contactNumber=" + contactNumber + ", Address="
				+ Address + "]";
	}
	public AirlineRegisterEntity(long id, String name, long contactNumber, String address) {
		super();
		this.id = id;
		this.name = name;
		this.contactNumber = contactNumber;
		Address = address;
	}
	public AirlineRegisterEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
