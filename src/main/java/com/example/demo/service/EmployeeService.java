package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.entity.Employee;

@Service
public class EmployeeService {
	
	private List<Employee> employeeList = new ArrayList<>();
	
	public Employee get(int id) {
		return employeeList.get(id-1);
	}
	
	public List<Employee> getall(){
		return employeeList;
	}
	
	public Employee add(EmployeeDTO employeeDTO) {
		Employee employee= new Employee(employeeList.size()+1, employeeDTO);
		employeeList.add(employee);
		return employee;
	}
	
	public List<Employee> update(int id, EmployeeDTO employeeDTO) {
		Employee employee= employeeList.get(id-1);
		employee.setName(employeeDTO.getName());
		employee.setSalary(employeeDTO.getSalary());
		
		employeeList.set(id-1, employee);
		return employeeList;
	}
	
	public  List<Employee> delete(int id) {
		employeeList.remove(id-1);
		return employeeList;
	}
}
