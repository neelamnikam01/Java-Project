package com.capgemini.training.lab1;

import java.util.Scanner;

public class Exercise8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		
		System.out.println(checknumber(n));
	}

	private static boolean checknumber(int n) {
		// TODO Auto-generated method stub
		boolean flag =false;
		if(n<=0) {
			return flag;
		}
		else {
			if(n%2==0) {
				while(n!=0) {
					if(n/2==0) {
						flag = true;
					}
					n=n/2;
				}
			}
		}
		return flag;
	}
}