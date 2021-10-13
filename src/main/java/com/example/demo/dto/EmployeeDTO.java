package com.example.demo.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data public class EmployeeDTO {

	@Pattern(regexp = "^[A-Z][a-z]{2,}$", message= "Invalid Name!")
	private String name;
	@Min(value = 500, message="Min Value is 500")
	private int salary;
	
	public EmployeeDTO(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}	
}
