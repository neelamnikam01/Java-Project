package com.cg.eis.pl;

import java.util.Map;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.InsuranceScheme;

public class Tester {

	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {

		int n=0;
		InsuranceScheme is = new InsuranceScheme();
		do {
			System.out.println("1.Add details");
			System.out.println("2.Enter insurance scheme to find out employee details");
			System.out.println("3.Delete employee details");
			System.out.println("Enter your choice");
			n= scanner.nextInt();

			switch(n) {
			case 1:
				System.out.println("Enter the employee details");
				Employee emp = new Employee();
				System.out.println("Enter the employee id");
				int id = scanner.nextInt();
				emp.setId(id);
				System.out.println("Enter the employee name");
				emp.setName(scanner.next());
				System.out.println("Enter the employee salary");
				emp.setSalary(scanner.nextDouble());
				System.out.println("Enter the employee designation");
				emp.setDesignation(scanner.nextLine());
				scanner.nextLine();
				System.out.println("Enter the insurance scheme");
				emp.setInsuranceScheme(scanner.nextLine());
				is.addDetails(id,emp);
				break;
				
			case 2:
				System.out.println("Enter the insurance scheme");
				String scheme = scanner.nextLine();
				Map<Integer, Employee> map = is.findEmployee(scheme);
				System.out.println(map);
				break;
				
			case 3:
				System.out.println("Enter the employee id that you what to delete");
				int deleteId = scanner.nextInt();
				Map<Integer, Employee> map1 = is.deleteDetails(deleteId);
				System.out.println(map1);
				break;
			
			}
		}while(n<=3);




	}

}
