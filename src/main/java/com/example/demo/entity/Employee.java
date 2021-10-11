package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.example.demo.dto.EmployeeDTO;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;	
	private int salary;
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Employee(int id, EmployeeDTO employeeDTO) {
		super();
		this.id = id;
		this.name = employeeDTO.getName();
		this.salary = employeeDTO.getSalary();
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
