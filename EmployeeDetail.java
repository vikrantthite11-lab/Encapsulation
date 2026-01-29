package com.enc;

public class EmployeeDetail {

	public static void main(String[] args) {
		
		Employee e = new Employee();
		System.err.println("Employee Details...");
		e.setEmpId(32);
		e.setName("Kunal");
		e.setSalary(55000);
		System.out.println("Employee ID = "+ e.getEmpId() );
		System.out.println("Employee name = "+ e.getName() );
		System.out.println("Employee salary = "+ e.getSalary() );
	}		
}
