package com.Base;

public class Customer {
private String userid;
private String name;
private String password;
private String email;


public Customer(String userid, String name, String password, String email) {
	super();
	this.userid = userid;
	this.name = name;
	this.password = password;
	this.email = email;
}
public String getId() {
	return userid;
}
public void setId(String id) {
	this.userid = userid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}


}
