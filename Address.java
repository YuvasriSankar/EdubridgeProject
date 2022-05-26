package com.edubridge.myspring;

import org.springframework.stereotype.Component;

@Component
public class Address {
 String city;
 String state;
 String country;
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public String toString() {
	return "Address [city=" + city + ", state=" + state + ", country=" + country + "]";
}
public Address(String city, String state, String country) {
	super();
	this.city = city;
	this.state = state;
	this.country = country;
}
 
public Address() {
	
}
public void printAddress() {
	System.out.println("Address Printing...");
}

}
