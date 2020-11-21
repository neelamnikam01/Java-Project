package com.training.capgemini.lab5.Exercise2;

public class NameException extends Exception{
	String str;
	public NameException(String string) {
		// TODO Auto-generated constructor stub
		str = string;
	}
	@Override
	public String toString() {
		return str;
	}
	
	
}
