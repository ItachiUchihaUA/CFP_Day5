package com.example.demo.dto;

public class EmployeeDTO {

	private String name;
	private int salary;
	
	
	
	public EmployeeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public EmployeeDTO(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeeDTO [name=" + name + ", salary=" + salary + "]";
	}
	
	
}
