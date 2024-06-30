package com.coderscampus.assignment3a;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class UserService {
	
	 
	static UserArray newUser = new UserArray();
	public static String readFile() {
	//reading the file
	try {
		BufferedReader file= new BufferedReader( new FileReader("data.txt"));
			
	try {
 String line="";
 System.out.println(line);
// fills username, password and name into the user POJO
		while((line= file.readLine()) != null) {
			System.out.println(line);
			
			String[] differentLine=line.split(",");
			System.out.println(Arrays.toString(differentLine));
				
				newUser.setPassword(differentLine[1]);
				String newPassword= newUser.getPassword();
				newUser.setName(differentLine[2]);
				String newName=newUser.getName();
				newUser.setUsername(differentLine[0]);
				String newUsername= newUser.getUsername();
				String[] nameList= new String[4];
				
		System.out.println(newPassword);
		System.out.println(newName);
		System.out.println(newUsername);
		
		}
		file.close();
		
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("Oops file is not found ");}
	return "This is the end";
	}
	//take in the user's inputs 

	public String takeInput (String newName) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Login here");
		System.out.println("Put your username first");
		String username=scanner.nextLine();
	if  (username.equals(newUser.getUsername())){
			System.out.println("That is a valid username");
		}
		System.out.println("Put your password in next");
		String password=scanner.nextLine();
		
		System.out.println("Put your name in last");
		String name= scanner.nextLine();
		
		
		return "Successfully logged in";
		
	}
	
	
	public void  verifyInput()
	{ for(i=0; i<)
		newUser.getUsername()
		
		

		
		
		
		 
		
	}
	
	
	}
		
	


