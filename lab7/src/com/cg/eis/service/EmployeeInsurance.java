package com.cg.eis.service;

import java.util.Map;

import com.cg.eis.bean.Employee;

public interface EmployeeInsurance {
	
	public Map<Integer, Employee> findEmployee(String scheme);
}
