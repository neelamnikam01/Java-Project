package com.capgemini.training.lab10.Exercise2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Exercise2 {
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the file name");
		String filename = scanner.nextLine();
		File file = new File(filename);
		long flength;
		
		if(file.exists()) {
			System.out.println("File exists");
		}
		else {
			System.out.println("File does not exist");
		}
		
		if(file.canRead()) {
			System.out.println("File is readable");
		}
		else {
			System.out.println("File is not readable");
		}
		
		if(file.canWrite()) {
			System.out.println("File is writable");
		}
		else {
			System.out.println("File is not writable");
		}
		flength = file.length();
		System.out.println("The file length is "+flength);
	}
	

}
