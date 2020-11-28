package com.cg.training.lab10.Exercise1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class Exercise1 {
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the file name");
		String filename = scanner.nextLine();
		Reader file;
		try {
			file = new FileReader(filename);
			BufferedReader br = new BufferedReader(file);
			int count=1;
			while(br.readLine()!=null) {
				System.out.println(count+" "+br.readLine());
				count++;
			}
			br.close();
		}
		catch (FileNotFoundException e1) {
			System.out.println("File not found");
			e1.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
