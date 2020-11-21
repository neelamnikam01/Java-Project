package com.capgemini.training.lab3;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		System.out.println("Number of characters:");
		System.out.println(str.length());
		String[] lines = str.split(".");
		System.out.println("Number of lines are "+lines.length);
		String[] words= str.split(" ");
		System.out.println("Number of words are: "+words.length);
	}

}
