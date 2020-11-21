package com.training.capgemini.lab5.Exercise2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) throws NameException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the firstName");
		String firstName = sc.nextLine();
		System.out.println("Enter the lastName");
		String lastName = sc.nextLine();
		
		try {
			if(firstName.equals("") || lastName.equals("")) {
				throw new NameException("Firstname or lastname should not be blank");
			}
		}
		catch(NameException e) {
			System.out.println(e);
		}

	}

}
