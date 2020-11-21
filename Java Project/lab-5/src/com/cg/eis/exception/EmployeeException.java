package com.cg.eis.exception;

public class EmployeeException extends Exception{
	
	String str;
	public EmployeeException(String string) {
		str = string;
		
	}
	@Override
	public String toString() {
		return str ;
	}
	

}
