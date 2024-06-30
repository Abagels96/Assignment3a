package com.coderscampus.assignment3a;


public class UserArray {
String username;
String password;
String name;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
@Override
public String toString() {
	return "UserArray [username=" + username + ", password=" + password + ", name=" + name + "]";
}
public void setPassword(String password) {
	this.password = password;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
}
