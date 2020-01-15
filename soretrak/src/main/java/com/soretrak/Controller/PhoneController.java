package com.soretrak.Controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soretrak.Repository.PhoneRepository;
import com.soretrak.model.Employee;
import com.soretrak.model.Phone;

@RestController
public class PhoneController {

	@Autowired
    private PhoneRepository phoneRepository;
	
	
	@GetMapping("/phone")
	public  ResponseEntity<Collection<Phone>> getAll(){
		
		Collection<Phone> phones= phoneRepository.findAll();
		return new ResponseEntity<Collection<Phone>>(phones,
				HttpStatus.OK);
		
	}
}
