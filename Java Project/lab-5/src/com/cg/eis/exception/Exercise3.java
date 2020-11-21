package com.cg.eis.exception;

import java.util.Scanner;

public class Exercise3 {
	
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) throws EmployeeException{
		// TODO Auto-generated method stub
		System.out.println("Enter the salary of the employee");
		double salary = sc.nextDouble();
		
		try {
			if(salary<3000) {
				throw new EmployeeException("Salary should not be less than 3000");
			}
			
		}catch(EmployeeException e) {
			System.out.println(e);
		}
		
	}

}
