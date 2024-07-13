package com.coderscampus.assignment3a;




public class UserApplication {

	public static void main(String[]args) {
		
UserService user= new UserService();

user.readFile();
String newUsername= user.newUsername;
user.createUsers( newUsername);
}
	}


