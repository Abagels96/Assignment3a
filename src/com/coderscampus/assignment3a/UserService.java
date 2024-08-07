package com.coderscampus.assignment3a;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class UserService {
User[] users1= new User[4];
	public         void readFile() {
		// reading the file

 		BufferedReader fileReader = null;
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
 
			try {
				String lines = "";
			
				
				System.out.println(lines);
				int i=0;
// fills username, password and name into the user POJO
				while ((lines = fileReader.readLine()) != null) {
					System.out.println(lines);

					String[] differentLines = lines.split(",");

					{
						

						User user = new User(differentLines[2], differentLines[1], differentLines[0]);
						
							users1[i] = user;
						i++;
							
						System.out.println(Arrays.toString(users1));
						System.out.println(Arrays.toString(differentLines));
						
						
						
					}
				}
				
				


				fileReader.close();

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

	public void takeInput(
		User[]	users1) 
	{
boolean correct=false;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<5;i++) {
		System.out.println("Login here");
		System.out.println("Put your username first");
		String username = scanner.nextLine();

		System.out.println("Put your password in next");
		String password = scanner.nextLine();

for(User user: users1) {
	System.out.println(user.getUsername());

if(username.equalsIgnoreCase(user.getUsername())) {
	System.out.println("Welcome"+" "+ user.getName());
	
	if(password.equals(user.getPassword())) {
		
		System.out.println("That is correct");
		correct=true;
		
		
		
	}if(correct==true) {
			System.out.println("Enter");
		i=5;
		}
	
		
	}
	
	}
}



if(correct==false) {
		System.out.println("Too many invalid attempts");}	

}






//System.out.print(password);
		
	{
}

}
