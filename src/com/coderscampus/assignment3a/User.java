package com.coderscampus.assignment3a;



public class User {
private static String username;
private static String password;
 private static String name;
public static  String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public static  String getPassword() {
	return password;
}
@Override
public String toString() {
	return "UserArray [username=" + username + ", password=" + password + ", name=" + name + "]";
}
public void setPassword(String password) {
	this.password = password;
}
public static String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public User(String name, String password, String username) {
	this.name=name;
	this.password=password;
	this.username=username;
}}


