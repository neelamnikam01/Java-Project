package com.cg.training.lab10.Exercise1;

import java.util.Scanner;

public class Exercise1{
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the value of x");
		int x = scanner.nextInt();
		System.out.println("Enter the value of y");
		int y = scanner.nextInt();
		
		MyFunctionalInterface ic = (int a,int b)->{return (Math.pow(x, y));};
		System.out.println(x+" raised to "+y+" is "+ic.calculate(x, y));
	}
}
