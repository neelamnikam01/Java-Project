package com.capgemini.training.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the string array length");
		int n= scanner.nextInt();
		System.out.println("Enter the string array");
		String[] arr = new String[n];
		for(int i=0 ;i<n;i++) {
			arr[i]= scanner.next();
		}
		sortStrings(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	private static void sortStrings(String[] arr) {
		Arrays.sort(arr);

		if(arr.length%2==0) {	
			for(int i=0; i<arr.length/2;i++) {
				arr[i]= arr[i].toUpperCase();
			}
			for(int i=arr.length; i<arr.length;i++) {
				arr[i]=arr[i].toLowerCase();
			}
		}
		else {
				for(int i=0;i<=arr.length/2;i++ ) {
					arr[i]= arr[i].toUpperCase();
			}
				for(int i=arr.length; i<arr.length;i++) {
					arr[i]=arr[i].toLowerCase();
				}
		}
	}

}
