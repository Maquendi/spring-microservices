package com.online.store.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Customer implements Serializable {
  private static final long serialVersionUID = 1L;
  
  @Id
  @Column(name="customerId")
  @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "cust_seq")
  @SequenceGenerator(name="cust_seq", sequenceName="cust_seq", allocationSize=1)
  private Long id;
  
  private String firstName;
  
  private String lastName;
  
  private Date dateOfBirth;
  
  private String emailAddress;
  
  private Date registeredDate;
  
  @OneToOne(cascade = CascadeType.ALL)
  private Address address;
  

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public Date getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}

public String getEmailAddress() {
	return emailAddress;
}

public void setEmailAddress(String emailAddress) {
	this.emailAddress = emailAddress;
}

public Date getRegisteredDate() {
	return registeredDate;
}

public void setRegisteredDate(Date registeredDate) {
	this.registeredDate = registeredDate;
}

public Address getAddress() {
	return address;
}

public void setAddress(Address address) {
	this.address = address;
}

}
