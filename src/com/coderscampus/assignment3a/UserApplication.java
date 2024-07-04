package com.coderscampus.assignment3a;




public class UserApplication {

	public static void main(String[]args) {
		
UserService user= new UserService();
	 user.readFile();
	
UserArray rats = new UserArray();
user.takeInput(rats.getUsername());


}
	}


