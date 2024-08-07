package com.coderscampus.assignment3a;

public class UserApplication {

	public static void main(String[] args) {

		UserService user = new UserService();

		user.readFile();
	
User[] users2 = user.users1;


	user.takeInput(users2);

		
	}
}
