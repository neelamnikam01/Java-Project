package com.capgemini.training.lab5.Exercise1;

public class AgeException extends Exception{
	public String str;
	public AgeException(String string) {
		// TODO Auto-generated constructor stub
		str = string;
	}
	@Override
	   public String toString() { 
		return (str);
	   }
	
	
}
