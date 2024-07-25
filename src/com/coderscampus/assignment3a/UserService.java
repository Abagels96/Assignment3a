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
	

	public void readFile() {
		// reading the file
		
		BufferedReader fileReader=null;
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));

			try {
				String lines = "";
				User[] users= new User [4];
				System.out.println(lines);
// fills username, password and name into the user POJO
				while ((lines = fileReader.readLine()) != null) {
					System.out.println(lines);
					
					
					
					String[] differentLines = lines.split(",");
					 if(differentLines!=null) { User user= new User(differentLines[0],differentLines[1],differentLines[2]);
					for (int i=0; i<4;i++) {
						users[i]=user;
					}
					
						System.out.println(Arrays.toString(users));
					System.out.println(Arrays.toString(differentLines));}}
				
			
					
					

					
				
//
				fileReader.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Oops file is not found ");}
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


}
