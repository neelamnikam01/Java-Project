package com.capgemini.training.lab1;

import java.util.Scanner;

public class Exercise3 {
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

        int n = scanner.nextInt();
        int t1 = 0;
        int t2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1 ; i <n; ++i)
        {
            System.out.print(t1 + " ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}


