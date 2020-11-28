package com.cg.training.lab6.Exercise6;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exercise6 {
	
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws ParseException {
		int n=0;
		Map<Integer,LocalDate> map = new HashMap<>();
		do {
		System.out.println("Enter the id and date of birth");
		Integer id = scanner.nextInt();
		String date1 = scanner.next();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate date = LocalDate.parse(date1, formatter);
		map.put(id, date);
		n++;
		}while(n!=2);
		
		List<Integer> list = votersList(map);
		for(int i=0;i<list.size();i++){
			System.out.println("Eligible voting id's are:");
		    System.out.println(list.get(i));
		} 
	
	}
	private static List<Integer> votersList(Map<Integer, LocalDate> map) {
		List<Integer> list = new ArrayList<>();
		LocalDate ldate = LocalDate.now();
		for(Map.Entry<Integer, LocalDate> m: map.entrySet() ) {
			Period age = Period.between(m.getValue(), ldate);
			if(age.getYears()>18) {
				list.add(m.getKey());
			}
		}
		return list;
	}

}