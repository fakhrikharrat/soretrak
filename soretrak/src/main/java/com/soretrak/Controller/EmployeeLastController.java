package com.soretrak.Controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

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


import com.soretrak.Repository.EmployeeLastRepository;
import com.soretrak.model.EmployeeLast;

@RestController

public class EmployeeLastController {

	@Autowired
    private EmployeeLastRepository empRepository;
	
	@GetMapping("/employee")
	public  ResponseEntity<Collection<EmployeeLast>> getAll(){
		
		Collection<EmployeeLast> emps= empRepository.findAll();
		return new ResponseEntity<Collection<EmployeeLast>>(emps,
				HttpStatus.OK);
	}
	
	@GetMapping("/employee/{id}")
	public Optional<EmployeeLast> getEmployeeById(@PathVariable ("id") Long empId){
		
		return empRepository.findById(empId);
	}
	@PostMapping("/employee")
	public ResponseEntity<EmployeeLast> save(@RequestBody EmployeeLast employee) {
		EmployeeLast savedEmployee = empRepository.save(employee);
		return new ResponseEntity<EmployeeLast>(savedEmployee,HttpStatus.CREATED);
		
		
	}
	@PutMapping("/employee/{id}")
	public  ResponseEntity<EmployeeLast> update(@RequestBody EmployeeLast employee) {
		EmployeeLast updatedEmployee = empRepository.save(employee);
		if (updatedEmployee==null)
			return new ResponseEntity<EmployeeLast>(HttpStatus.INTERNAL_SERVER_ERROR);
		return new ResponseEntity<EmployeeLast>(updatedEmployee,HttpStatus.OK);
		
		
	}
	@DeleteMapping("/employee/{id}")
	public  ResponseEntity<EmployeeLast>  delete(@PathVariable ("id") Long empId){
		
		empRepository.deleteById(empId);
		/*
		Optional<Employee> emp = empRepository.findById(empId);
		
		if (emp.isPresent()) {
			empRepository.deleteById(empId);
		}*/
		return new ResponseEntity<EmployeeLast>(HttpStatus.NO_CONTENT);
		
	}
	
}
