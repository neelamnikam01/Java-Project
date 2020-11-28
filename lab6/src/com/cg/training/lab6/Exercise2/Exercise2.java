package com.cg.training.lab6.Exercise2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise2 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number of elements in the array");
		int n = scanner.nextInt();
		System.out.println("Enter array elements");
		char[] ch = new char[n];
		for(int i=0; i<n; i++) {
			ch[i] = scanner.next().charAt(0);
		}
		System.out.println(countChars(ch));
	}
	private static Map<Character, Integer> countChars(char[] ch) {
		Map<Character, Integer> map = new HashMap<>();
		Integer count=0;
		for(int i=0; i<ch.length; i++) {
			char c= ch[i];
			if(map.containsKey(c)) {
				count= map.get(c);
				map.put(c, ++count);
			}
			else {
				map.put(c, 1);
			}
		}
		return map;

	}

}
