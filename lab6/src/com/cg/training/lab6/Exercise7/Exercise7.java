package com.cg.training.lab6.Exercise7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise7 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
	
		System.out.println("Enter the number of elements in the array");
		int n= scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements");
		for(int i=0; i<n; i++) {
			arr[i] = scanner.nextInt();
		}
		getSorted(arr);
	}
	private static int  getSorted(int[] arr) {
		StringBuilder []sb = new StringBuilder[arr.length];
		for(int i=0; i<arr.length;i++) {
			sb[i].append(arr[i]).reverse();
		}
		Collections.sort(Arrays.asList(sb));
		return 0;
	}

}
