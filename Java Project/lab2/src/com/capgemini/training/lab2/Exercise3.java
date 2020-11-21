package com.capgemini.training.lab2;

import java.util.Scanner;

public class Exercise3 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements in the array");
		int n = scanner.nextInt();
		
		
		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		StringBuilder[] num = new StringBuilder[arr.length];
		for(int i: arr) {
			num[i].append(arr[i]);
			System.out.println(num[i]);
		}
		
		
	
	}
}
