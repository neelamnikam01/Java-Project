package com.capgemini.training.lab4.exercise1.client;

import java.util.Scanner;

import com.capgemini.training.lab4.exercise1.service.Account;
import com.capgemini.training.lab4.exercise1.service.CurrentAccount;
import com.capgemini.training.lab4.exercise1.service.Person;
import com.capgemini.training.lab4.exercise1.service.SavingAccount;

public class Tester {
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Person p = new Person();
		System.out.println("Enter the name of the accountholder");
		String name = scanner.next();
		p.setName(name);
		int age = scanner.nextInt();
		p.setAge(age);
		
		Account acc = new Account();
		long accNum = scanner.nextLong();
		acc.setAccNum(accNum);
		double balance = scanner.nextDouble();
		acc.setBalance(balance);
		
		
		CurrentAccount ca = new CurrentAccount(null, 0, 0, 0, 0);
		
		SavingAccount sa = new SavingAccount(null, 0, 0, 0);
	}

}
