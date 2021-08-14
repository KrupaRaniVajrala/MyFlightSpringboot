package com.Admin.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class FlightEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String flightNumber;
	private String logo;

	private String fromLoc;

	private String toLoc;

	private String scheduleTime;
	private String model;
	private Long price;
	
	
//	@ManyToOne
//	@JsonIgnore	
//    @JoinColumn(name = "arentity_id",referencedColumnName = "id")
  
    
//	private AirlineRegisterEntity arentity;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getFromLoc() {
		return fromLoc;
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

	public String getScheduleTime() {
		return scheduleTime;
	}

	public void setScheduleTime(String scheduleTime) {
		this.scheduleTime = scheduleTime;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FlightEntity [id=" + id + ", flightNumber=" + flightNumber + ", logo=" + logo + ", fromLoc=" + fromLoc
				+ ", toLoc=" + toLoc + ", scheduleTime=" + scheduleTime + ", model=" + model + ", price=" + price + "]";
	}

	public FlightEntity(Long id, String flightNumber, String logo, String fromLoc, String toLoc, String scheduleTime,
			String model, Long price) {
		super();
		this.id = id;
		this.flightNumber = flightNumber;
		this.logo = logo;
		this.fromLoc = fromLoc;
		this.toLoc = toLoc;
		this.scheduleTime = scheduleTime;
		this.model = model;
		this.price = price;
	}

	public FlightEntity() {
		super();

	}

}
