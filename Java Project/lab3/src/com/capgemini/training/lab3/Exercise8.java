package com.capgemini.training.lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise8 {
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the string");
		String str = scanner.nextLine();
		
		System.out.println(checkString(str));
		
	}
	private static boolean checkString(String str) {
		// TODO Auto-generated method stub
		
		char ch[] = new char[str.length()];
		for(int i=0; i<str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		
		Arrays.sort(ch);
		
		for(int i=0; i<str.length(); i++) {
			if(ch[i]==str.charAt(i)) {
				return true;
			}
		}
		return false;
	}
}
