package com.cg.esi.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeService;

import com.cg.eis.service.EmployeeServiceImplementation;

public class EISDemo {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		EmployeeService emp = new EmployeeServiceImplementation(); 
		emp.getEmployeeDetails(e1);
		System.out.println("Insurance Scheme : "+emp.findInsuranceScheme(e1));
		emp.showEmployeeDetails(e1);
	}

}
