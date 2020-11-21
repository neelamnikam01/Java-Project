package com.capgemini.training.lab1;

import java.util.Scanner;

public class Exercise5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth natural number");
		int n = sc.nextInt();
		System.out.println("Sum of numbers divisible by 3 or 5 is "+calculateSum(n));
	}
		
		public static int calculateSum(int n) {
			int sum=0;
			for(int i=1;i<=n;i++) {
				if(i%3==0 || i%5==0) {
					sum=sum+i;
				}
			}
			return sum;
		}
		
	
}
