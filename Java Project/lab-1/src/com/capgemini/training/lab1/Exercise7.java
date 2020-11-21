package com.capgemini.training.lab1;

import java.util.Scanner;

public class Exercise7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		System.out.println(checkNumber(n));

	}

	private static boolean checkNumber(int n) {
		// TODO Auto-generated method stub
		boolean flag = false;
		String x = Integer.toString(n);
		int[] number = new int[x.length()];
		for(int i=0; i<x.length(); i++) {
			number[i] = x.charAt(i);
		}
		for(int i=0; i<x.length()-1; i++) {
			if(number[i]>number[i+1]) {
				flag = false;
				break;
			}
			flag = true;
		}
		return flag;
	}
}