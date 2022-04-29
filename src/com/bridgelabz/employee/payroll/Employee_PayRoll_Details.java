package com.bridgelabz.employee.payroll;

public class Employee_PayRoll_Details {
	private int id;
	private String name;
	private double salary;
	
	public Employee_PayRoll_Details(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee_PayRoll_Details [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
	
}
