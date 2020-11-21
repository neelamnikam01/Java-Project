package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Designation;
import com.cg.eis.bean.Employee;

public class EmployeeServiceImplementation implements EmployeeService{
	
	public EmployeeServiceImplementation(){
		
	}

	private static Scanner sc = new Scanner(System.in);
	@Override
	public void getEmployeeDetails(Employee emp) {
		
		System.out.println("Enter employee details:");
		
		System.out.println("Enter employee id:");
		emp.setId(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Enter employee name:");
		emp.setName(sc.nextLine());
		
		System.out.println("Enter employee salary:");
		emp.setSalary(Double.parseDouble(sc.nextLine()));
		
		System.out.println("Enter employee designation(SYSTEM_ASSOCIATE, MANAGER, PROGRAMMER, CRERK):");
		String des = sc.nextLine();
		
		if(des.equalsIgnoreCase("director"))
			emp.setDesignation(Designation.DIRECTOR);
		else if (des.equalsIgnoreCase("manager"))
			emp.setDesignation(Designation.MANAGER);
		else if(des.equalsIgnoreCase("leader"))
			emp.setDesignation(Designation.LEADER);
		else if(des.equalsIgnoreCase("member"))
			emp.setDesignation(Designation.MEMBER);
	}

	@Override
	public String findInsuranceScheme(Employee emp) {
	
		Designation desig = emp.getDesignation();
		Double salary = emp.getSalary();
		String scheme = null;
		
		if(desig.equals(Designation.DIRECTOR) && (salary > 500000 && salary < 200000))
			scheme = "Scheme A";
		else if(desig.equals(Designation.LEADER) && (salary >= 10000 && salary < 40000))
			scheme = "Scheme B";
		else if(desig.equals(Designation.MANAGER) && (salary >= 40000))
			scheme = "Scheme C";
		else if(desig.equals(Designation.MEMBER) && (salary < 5000))
			scheme = "No Scheme";
		
		emp.setInsuranceScheme(scheme);
		return scheme;
	}

	@Override
	public void showEmployeeDetails(Employee emp) {
		
		System.out.println("Employee Details:");
		System.out.println(emp);
		
	}

}
