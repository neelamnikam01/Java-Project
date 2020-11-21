package com.capgemini.training.lab3;

import java.util.Scanner;

public class Exercise4 {
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the number");
		int n = scanner.nextInt();
		String number = Integer.toString(n);
		
		System.out.println(modifyNumber(number));
		
		
	}
	private static int modifyNumber(String number) {
		
		int num1[] = new int[number.length()];
		char ch[] = new char[number.length()];
		//int difference[] = new int[number.length()-1];
		int difference;
		int finalInt;
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<number.length();i++) {
			ch[i]= number.charAt(i);
		}
		for(int i=0;i<ch.length;i++) {
			num1[i] = Integer.parseInt(String.valueOf(ch[i]));
		}
		for(int i=0;i<ch.length-1;i++) {
			difference= Math.abs(num1[i]-num1[i+1]);
			sb.append(difference);
		}
		finalInt = Integer.parseInt(sb.toString());
		return finalInt;
	}

}
