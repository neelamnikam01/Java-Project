package com.cg.training.lab6.Exercise4;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Exercise4 {
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int n=0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		do {
			System.out.println("Enter the registration number");
			int id = scanner.nextInt();
			System.out.println("Enter the marks");
			int marks = scanner.nextInt();
			map.put(id,marks);
			n++;
		}while(n!=5);
		System.out.println(getStudents(map));
	}
	private static Map<Integer, String> getStudents(Map<Integer, Integer> map) {
		String medal ="";
		Map<Integer,String> map1 = new HashMap<>();
		for(Map.Entry m : map.entrySet()) {
			if((int)m.getValue()>=90) {
				medal ="Gold";
				map1.put((int)m.getKey(),medal);
			}
			else if((int) m.getValue()>=80 && (int)m.getValue()<90) {
				medal ="Silver";
				map1.put((int)m.getKey(),medal);
			}
			else if((int)m.getValue()>=70 && (int)m.getValue()<80) {
				medal="Bronze";
				map1.put((int)m.getKey(),medal);
			}
		}
		return map1;
		
		
	}

}
