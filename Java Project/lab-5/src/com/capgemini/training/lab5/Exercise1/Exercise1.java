package com.capgemini.training.lab5.Exercise1;

import java.util.Scanner;

public class Exercise1 {
	
	public static void main(String[] args) throws AgeException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		
		try {
			if(age<15) {
				throw new AgeException("Age of the person should be above 15");
			}
			else {
				System.out.println("Welcome");
			}
		}
		catch(AgeException e) {
			System.out.println(e);
			
		}
	}
}
