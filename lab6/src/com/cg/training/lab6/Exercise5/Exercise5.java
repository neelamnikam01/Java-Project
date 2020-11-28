package com.cg.training.lab6.Exercise5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Exercise5 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number of elements in the array");
		int n= scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter array elements");
		
		for(int i=0;i<n;i++) {
			arr[i]= Integer.valueOf(scanner.nextInt());
		}
		System.out.println("The second smallest element of array is: "+getSecondSmallest(arr));
	}
	private static int getSecondSmallest(int[] arr) {
		Integer[] arr1 = new Integer[arr.length];
		int second;
		for(int i=0;i<arr.length;i++) {
			arr1[i] = Integer.valueOf(arr[i]);
		}
		Collections.sort(Arrays.asList(arr1));
		second = arr1[1];
		return second;
	}
	
	

}
