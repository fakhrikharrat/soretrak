package com.soretrak.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.persistence.Temporal;
//import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

//import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="EmployeeLast")
@EntityListeners(AuditingEntityListener.class)

public class EmployeeLast {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotBlank
	private String name;
	@NotBlank
	private String designation;
	@NotBlank
	private String expertise;
	
	private Date dated_crea ;
	//@Temporal(TemporalType.TIMESTAMP)
	//@LastModifiedDate
	//private Date createdAt;
	
	
	
	
	public Long getId() {
		return id;
	}
	public Date getDated_crea() {
		return dated_crea;
	}
	public void setDated_crea(Date dated_crea) {
		this.dated_crea = dated_crea;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getExpertise() {
		return expertise;
	}
	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
	
	
	public EmployeeLast() {
		
		
	}
	public EmployeeLast(Long id, @NotBlank String name, @NotBlank String designation, @NotBlank String expertise, Date dated_crea) {
		
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.expertise = expertise;
		this.dated_crea = dated_crea;
		
		
	}
}
