package com.cg.eis.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.cg.eis.bean.Employee;

public class InsuranceScheme implements EmployeeInsurance{
	Employee emp =new Employee();

	private static Map<Integer, Employee> map = new HashMap<>();

	public Map<Integer, Employee> addDetails(int id, Employee emp){
		map.put(emp.getId(), emp);
		return map;
	}


	@Override
	public Map<Integer, Employee> findEmployee(String scheme) {
		Map<Integer, Employee> map1 = new HashMap<>();
		for(Entry<Integer, Employee> m : map.entrySet()) {
			if(scheme.equalsIgnoreCase(emp.getInsuranceScheme())) {
				map1.put(emp.getId(),emp);
			}
		}
		return map;
	}
	

	public Map<Integer, Employee> deleteDetails(int deleteId) {
		
		for(Entry<Integer, Employee> m : map.entrySet()) {
			if(emp.getId()==deleteId) {
				map.remove(emp.getId());
			}
		}
		return map;
	}




	/*
	 * @Override public String findScheme() {
	 * 
	 * if(emp.getSalary()>5000 && emp.getSalary()<20000 &&
	 * emp.getDesignation().equalsIgnoreCase("system associate")){ return
	 * "Scheme c"; } else if(emp.getSalary()>=20000 && emp.getSalary()<40000 &&
	 * emp.getDesignation().equalsIgnoreCase("programmer")) { return "Scheme B"; }
	 * else if(emp.getSalary()>=40000 &&
	 * emp.getDesignation().equalsIgnoreCase("manager")) { return "Scheme A"; } else
	 * if(emp.getSalary()<5000 && emp.getDesignation().equalsIgnoreCase("clerk")) {
	 * return "No scheme"; } return null; }
	 */


}
