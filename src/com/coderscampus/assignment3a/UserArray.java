package com.coderscampus.assignment3a;



public class UserArray {
private String username;
private String password;
 private String name;
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
public UserArray userCreate(String username,String password, String name) {
	UserArray user1= new UserArray();
 UserArray user2=new UserArray();
	
	user1.setPassword(password);
	user1.setName(name);
	
	user1.setUsername(username);
	user2.setName(name);
	user2.setPassword(password);
	user2.setUsername(username);
	return user1;
	
}
}
