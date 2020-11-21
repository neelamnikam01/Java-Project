package com.capgemini.training.lab1;

import java.util.Scanner;

public class Exercise1 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String args[]){

		System.out.println("Enter a number");

		int number= scanner.nextInt();
		int sum=0;

		while(number!=0)
		{
			int digit= number%10;
			sum=sum+digit*digit*digit;
			number=number/10;
		}
		System.out.println("The sum of cubes of digits of the given number is " +sum);

	}

}
