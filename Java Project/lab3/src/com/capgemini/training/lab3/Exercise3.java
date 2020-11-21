package com.capgemini.training.lab3;

import java.util.Scanner;

public class Exercise3 {
	private static Scanner scanner =new Scanner(System.in);
	public static void main(String[] args)
	{ 

		System.out.println("enter the string");
		String str=scanner.nextLine();
		
		System.out.println(modifyString(str));
		
		
	}
	private static String modifyString(String str) {
		// TODO Auto-generated method stub
		String newString = "";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			int a=ch;
			if(ch!='a'&& ch!='A'&& ch!='e'&& ch!='E'&& ch!='i'&& ch!='I'&& ch!='o'&& ch!='O'&& ch!='U'&& ch!='u')
			{
				ch=(char)(a+1);
				newString=newString+ch;
			}
			else
			{
				newString=newString+ch;
			}
		}
		return newString;
	}
}
