package com;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
//@Table(name= "emp500")
public class Employee {

@Id
@GeneratedValue
@Column(name="emp_id")
private int id;
@Column(name="first_Name",length=20,unique=true)
private String firstName;
@Column(name="last_Name",nullable=false)
private String lastName;
@Transient
private double salary;

public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getId() {
	return id;
}
public void setId(int id) {
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


}
