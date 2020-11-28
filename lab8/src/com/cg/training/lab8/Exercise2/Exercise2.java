package com.cg.training.lab8.Exercise2;

import java.time.LocalTime;
import java.util.Scanner;

public class Exercise2 {
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		
		Thread t1 = new Thread();
		int n=0;
		while(n<11) {
			LocalTime lt = LocalTime.now();
			System.out.println(LocalTime.now());
			try {
				t1.sleep(10000);;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			n++;
		}
		

	}

}
