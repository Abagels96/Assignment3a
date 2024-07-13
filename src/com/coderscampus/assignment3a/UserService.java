package com.coderscampus.assignment3a;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class UserService {
	
 User newUser=  new User(User.getPassword(), User.getName(), User.getUsername());

	public void readFile() {
		// reading the file
		try {
			BufferedReader file = new BufferedReader(new FileReader("data.txt"));

			try {
				String lines = "";
				System.out.println(lines);
// fills username, password and name into the user POJO
				while ((lines = file.readLine()) != null) {
					System.out.println(lines);

					String[] differentLines = lines.split(",");
					System.out.println(Arrays.toString(differentLines));
					
					newUser.setPassword(differentLines[1]);

					newUser.setName(differentLines[2]);

					newUser.setUsername(differentLines[0]);
					
			
   for(String line:differentLines) {
	   User otherUser= new User(User.getPassword(),User.getName(),User.getUsername());
	   System.out.println(otherUser.toString());
   }
					
					
					}
//
				file.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Oops file is not found ");
		}
				

	}
	// take in the user's inputs

	public String takeInput() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Login here");
		System.out.println("Put your username first");
		String username = scanner.nextLine();

		System.out.println("Put your password in next");
		String password = scanner.nextLine();

		System.out.println("Put your name in last");
		String name = scanner.nextLine();

		return "this is the last time";
	}
	 
	public void createUser() {
		User[] many = new User[4];
		for (int i = 0; i < 4; i++) {

			many[i] = new User(User.getName(),User.getPassword(),User.getUsername());

		}
		System.out.println(Arrays.toString(many));
	}
}