package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmployeeDTO;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeServ;
	
	@GetMapping("/{id}")
	public ResponseEntity<ResponseDTO> getEmployeeData(@PathVariable int id) {
		Employee emp = employeeServ.get(id);
		ResponseDTO resposneDTO = new ResponseDTO("Data is:", emp);
		return new ResponseEntity<ResponseDTO>(resposneDTO, HttpStatus.OK);
	}

	
	@GetMapping("/")
	public ResponseEntity<ResponseDTO> getAllEmployeeData() {
		List<Employee> empList = employeeServ.getall();
		ResponseDTO resposneDTO = new ResponseDTO("Total List!", empList);
		return new ResponseEntity<ResponseDTO>(resposneDTO, HttpStatus.OK);
	}
	
	@PostMapping(path="/add")
	public ResponseEntity<ResponseDTO> post(@RequestBody EmployeeDTO employeeDTO) {
		ResponseDTO resposneDTO = new ResponseDTO("Added successfully!", employeeServ.add(employeeDTO));
		return new ResponseEntity<ResponseDTO>(resposneDTO, HttpStatus.OK);
	}

	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDTO> delete(@PathVariable int id) {
		ResponseDTO resposneDTO = new ResponseDTO("Deleted!", employeeServ.delete(id));
		return new ResponseEntity<ResponseDTO>(resposneDTO, HttpStatus.OK);
	}	

	@PutMapping("/update/{id}")
	public ResponseEntity<ResponseDTO> update(@PathVariable("id") int id ,@RequestBody EmployeeDTO employeeDTO) {
		ResponseDTO resposneDTO = new ResponseDTO("Updated!", employeeServ.update(id, employeeDTO));
		return new ResponseEntity<ResponseDTO>(resposneDTO, HttpStatus.OK);
	}
	
}
