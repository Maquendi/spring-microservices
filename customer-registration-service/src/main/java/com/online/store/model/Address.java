package com.online.store.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


@Entity
public class Address implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="addressId")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "address_seq")
	@SequenceGenerator(name="address_seq", sequenceName="address_seq", allocationSize=1)
	private long id;
	
	private String streetName;
	
	private String city;
	
	private String houseNumber;
	
	private String countryName;
	
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + ", houseNumber=" + houseNumber
				+ ", countryName=" + countryName + "]";
	}

}
