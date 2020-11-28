package com.cg.training.lab6.Exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class TesterClass {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		int n=0;
		do {
			System.out.println("Enter the roll number of the student");
			int rollNo = scanner.nextInt();
			System.out.println("Enter the student name");
			String name = scanner.next();
			n++;
			map.put(rollNo, name);
		}while(n!=5);
		
		List sortList=sortedList(map);
		System.out.println(sortList);
		
	}
		public static List<String> sortedList(Map<Integer, String> map){
			
			List<String> sortList = new ArrayList<String>();
			for(Entry<Integer, String> m : map.entrySet()) {
				sortList.add(m.getValue());
			}
			Collections.sort(sortList);
			return sortList;
		}
	
}
