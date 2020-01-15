package com.soretrak.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.soretrak.Repository.EmployeeRepository;

import com.soretrak.model.Employee;

@RestController
public class EmployeeController {
	@Autowired
    private EmployeeRepository employeeRepository;
	
	@GetMapping("/employee1")
	public  ResponseEntity<Collection<Employee>> getAll(){
		
		Collection<Employee> employees= employeeRepository.findAll();
		return new ResponseEntity<Collection<Employee>>(employees,
				HttpStatus.OK);
		
	}
	
	@GetMapping("/employeeCompany/{id}")
	public  ResponseEntity<Collection<Employee>> getEmployeeByCompanyId(@PathVariable ("id") Long companyId){
		
		Collection<Employee> employees= employeeRepository.findByCompanyId(companyId);
		return new ResponseEntity<Collection<Employee>>(employees,
				HttpStatus.OK);
		
	}
}
