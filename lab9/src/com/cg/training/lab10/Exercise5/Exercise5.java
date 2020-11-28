package com.cg.training.lab10.Exercise5;

import java.util.Scanner;

public class Exercise5 {
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		MyFunctionalInterface myInt = (int number)->{
			int fact=1;
			if (number==0) {
				fact=1;
			}
			else if (number>0){
				while(number!=0) {
					fact = fact*number;
					number--;
				}
			}
			return fact;
		};
		System.out.println(myInt.calculateFactorial(num));
	}
}
