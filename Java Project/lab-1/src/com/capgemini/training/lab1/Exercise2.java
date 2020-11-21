package com.capgemini.training.lab1;

import java.util.Scanner;

public class Exercise2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice");
		String choice = sc.next().toLowerCase();
		
		switch (choice) {
		case "red":
			System.out.println("STOP");
			break;
		case "green":
			System.out.println("GO");
			break;
		case "yellow":
			System.out.println("READY");
			break;
		}

	}

}
