package com.capgemini.training.lab1;

import java.util.Scanner;

public class Exercise6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the nth natural number");
		int n = sc.nextInt();
		System.out.println("Difference is "+calculateDifference(n));
		
	}
	public static int calculateDifference(int n) {
		int difference = 0;
		int sumOfn=0;
		int sumOfSqN=0;
		//calculating sum of n natural numbers and squaring them
		for(int i=1;i<=n;i++) {
			sumOfn=sumOfn+i;
		}
		int sqOfN = (int) Math.pow(sumOfn,2);
		
		// Squaring each number and adding them.
		for(int i=1; i<=n; i++) {
			int square = 0;
			square = (int) Math.pow(i, 2);
			sumOfSqN = sumOfSqN + square;
		}
		
		difference = sumOfSqN - sumOfn;
	
	return difference;
	}

}
