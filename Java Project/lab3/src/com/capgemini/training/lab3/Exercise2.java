package com.capgemini.training.lab3;

import java.util.Scanner;

public class Exercise2 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the string");
		String str = scanner.next();
		StringBuffer sb= new StringBuffer();
		sb.append(str);
		
		System.out.println(str+"|"+sb.reverse());
	}

}
