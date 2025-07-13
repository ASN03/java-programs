package com.elemica.assignment.four;

public class Manager extends Employee {
	
	
	public Manager(String managerId, String managerName, int managerSalary) {
		super(managerId, managerName, managerSalary);
		// TODO Auto-generated constructor stub
	}

	public void displayEmpDetails() {
		System.out.println("Manager Details:");
		System.out.println("Emp ID:" + this.getEmpId());
		System.out.println("Name: " + this.getEmpName());
		System.out.println("Salary: " + this.getEmpSalary());
		
	}
}
