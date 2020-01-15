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
import org.springframework.web.bind.annotation.RestController;

import com.soretrak.Repository.DragentRepository;

import com.soretrak.model.Dragent;


@RestController
public class DragentController {

	@Autowired
    private DragentRepository agentRepository;
	
	@GetMapping("/agent")
	public  ResponseEntity<Collection<Dragent>> getAll(){
		
		Collection<Dragent> agents= agentRepository.findAll();
		return new ResponseEntity<Collection<Dragent>>(agents,
				HttpStatus.OK);
		
	}
		
	@GetMapping("/agent/{matric}")
	public Optional<Dragent> getDragentById(@PathVariable ("matric") Long matricId){
		
		return agentRepository.findById(matricId);
	}
	
	@GetMapping("/byprenom/{prenom}")
	public List<Dragent> getDragentByPrenom(@PathVariable ("prenom") String  prenom){
		
		  return agentRepository.findByPrenomLikeIgnoreCaseOrderByMatric('%'+prenom+'%');
	
	}
	@GetMapping("/byprenom")
	public List<Dragent> getAllByNom(){
		
		  return agentRepository.findAll();
		  
	
	}
	@GetMapping("/bymatric/{matric}")
	public Dragent findByMatric(@PathVariable ("matric") Long  matric){
		
		  return agentRepository.findByMatric1122(matric);
	
	}
	
	
	@PostMapping("/agent")
	public ResponseEntity<Dragent> save(@RequestBody Dragent Dragent) {
		Dragent savedDragent = agentRepository.save(Dragent);
		return new ResponseEntity<Dragent>(savedDragent,HttpStatus.CREATED);
		
		
	}
	@PutMapping("/agent/{matric}")
	public  ResponseEntity<Dragent> update(@RequestBody Dragent Dragent) {
		Dragent updatedDragent = agentRepository.save(Dragent);
		if (updatedDragent==null)
			return new ResponseEntity<Dragent>(HttpStatus.INTERNAL_SERVER_ERROR);
		return new ResponseEntity<Dragent>(updatedDragent,HttpStatus.OK);
		
		
	}
	@DeleteMapping("/agent/{matric}")
	public  ResponseEntity<Dragent>  delete(@PathVariable ("id") Long matricId){
		
		agentRepository.deleteById(matricId);
		/*
		Optional<Dragent> emp = agentRepository.findById(empId);
		
		if (emp.isPresent()) {
			agentRepository.deleteById(empId);
		}*/
		return new ResponseEntity<Dragent>(HttpStatus.NO_CONTENT);
		
	}
	
}
