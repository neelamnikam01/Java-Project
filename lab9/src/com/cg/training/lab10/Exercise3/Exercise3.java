package com.cg.training.lab10.Exercise3;

import java.util.Scanner;

public class Exercise3 {
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the username");
		String username = scanner.next();
		System.out.println("Enter the passowrd");
		String password = scanner.next();
		
		MyInterface myInterface = (String uname, String pass)->{
			if(uname.isEmpty() || pass.isEmpty()) {
				return false;
			}
			return true;
		};
		System.out.println(myInterface.acceptDetails(username, password));
	}

}
