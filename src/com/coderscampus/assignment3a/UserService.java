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
	static String newPassword;
	static String newUsername;
	static String newName;

	static UserArray newUser = new UserArray(newName, newPassword, newUsername);

	public String readFile() {
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

					String newName = newUser.getName();
					String newUsername = newUser.getUsername();
					String newPassword = newUser.getPassword();

					System.out.println(newUsername);
					System.out.println(newPassword);
					System.out.println(newName);
					System.out.println(newUser);
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
		return newUsername;

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

	public void createUsers(String newUsername) {
		UserArray[] many = new UserArray[4];
		for (int i = 0; i < 4; i++) {

			many[i] = new UserArray(newUsername, newPassword, newName);

		}
		System.out.println(Arrays.toString(many));
	}
}