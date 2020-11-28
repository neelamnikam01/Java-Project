package com.cg.training.lab6.Exercise3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Exercise3 {
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number of elements in the array");
		int n= scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0; i<n; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println(getSquares(arr));

	}
	private static Map<Integer, Integer> getSquares(int[] arr) {
		Integer[] arr1 = new Integer[arr.length];
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0 ;i<arr1.length;i++) {
			arr1[i] = Integer.valueOf(arr[i]);
			map.put(arr1[i],(arr[i]*arr[i]));
		}
		return map;
		
	}

}
