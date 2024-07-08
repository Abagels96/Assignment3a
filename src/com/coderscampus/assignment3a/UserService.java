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
	
	static UserArray newUser = new UserArray();
	static UserArray newUser1= new UserArray();
	static UserArray newUser2= new UserArray();
 static String newUsername = newUser.getUsername();
	static String newPassword = newUser.getPassword();
	static String newName=newUser.getName();

	public static String readFile() {
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
					String newPassword = newUser.getPassword();
					newUser.setName(differentLines[2]);
					String newName = newUser.getName();
					newUser.setUsername(differentLines[0]);
					String newUsername = newUser.getUsername();
					for(String line:differentLines) {
						newUser.userCreate(newUsername, newPassword, newUsername);}
					}
				 System.out.println(newUsername);
					System.out.println(newPassword);
					System.out.println(newName);
							
	
				
				file.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Oops file is not found ");
		}
		
		return "This is the end";
	}
	// take in the user's inputs

	public String takeInput(String newName) {

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
		

	

	public void createUsers() {
	
		Object[] many= new Object[4];
		for(int i=0; i<4; i++) {
			
			many[i]=newUser.userCreate(newUsername, newPassword, newName);		
			
			}
			System.out.println(Arrays.toString(many));
	}
}
