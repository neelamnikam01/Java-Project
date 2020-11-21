package com.capgemini.training.lab2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise1 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of elements of the array");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Second smallest element of the array is: "+getSecondSmallest(arr));

	}
	private static int getSecondSmallest(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		int x=0;
		for(int i : arr) {
			x = arr[1];
		}
		return x;
	}

}
