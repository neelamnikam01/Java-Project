package com.capgemini.training.lab2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Exercise4 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Enter the number of elements in array");
		int n= scanner.nextInt();
		System.out.println("Enter the array elements");
		Integer  arr[]= new Integer[n];
		for(int i=0;i<n;i++) {
			arr[i]=scanner.nextInt();
		}
		
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("Modified array is "+Arrays.toString(modifyArray(arr)));
		
	}
	private static Integer[] modifyArray(Integer[] arr) {
		Integer[] temp = new Integer[arr.length-1];
        
        int index = 0;
        for (int indexI = 0; indexI < arr.length - 1; indexI++) 
        {
            Integer currentElement = arr[indexI];
             
            if (currentElement != arr[indexI+1]) {
                temp[index++] = currentElement;
            }
        }
         
        temp[index++] = arr[arr.length-1];
         
        return temp;
    }
	
}


