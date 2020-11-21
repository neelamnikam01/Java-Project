package com.capgemini.training.lab3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class Exercise9 {
	
	public static void main(String[] args) {
		
		LocalDateTime dateTime = LocalDateTime.now();
		printDuration(dateTime);
	}

	private static void printDuration(LocalDateTime dateTime) {
		// TODO Auto-generated method stub
		DateFormat dateFormatted = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(dateFormatted.format(dateTime));
		
	}
}
