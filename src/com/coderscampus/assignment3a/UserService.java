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
	String newUsername= newUser.getUsername();
	 String newPassword= newUser.getPassword();
	static UserArray newUser = new UserArray();
	static String[] nameList= new String[3];
	
    
	
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
			
				
				for(int i=0; i<1; i++) {
				nameList=Arrays.copyOfRange(differentLine, 0, i+1);
				System.out.println(Arrays.toString(nameList));}
			
		
				;
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
	if  (username.equals(nameList)){
			System.out.println("That is a valid username");
		System.out.println("Put your password in next");
		String password=scanner.nextLine();
		
		System.out.println("Put your name in last");
		String name= scanner.nextLine();
		
		
			 System.out.println(Arrays.toString(nameList));
	}
	return "this is the last time";
	
	

	

	
		
		
		 
		
	}
	
	
	}
		
	


