package com.cg.training.lab10.Exercise2;

import java.util.Scanner;

public class Exercise2 {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the string");
		String str = scanner.next();

		MyFunctionalInterface myInterface = (String s)->{
			for(int i=0;i<str.length();i++) {
			s = s.charAt(i)+" "+s.charAt(i+1);
			}
			return s;};
			
			System.out.println("String is "+myInterface.formatString(str));
	}

}
