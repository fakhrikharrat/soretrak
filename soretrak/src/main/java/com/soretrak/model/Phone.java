package com.soretrak.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity(name = "Phone")
@Table(name = "phone")
public class Phone {
	
	@Id
    @Column(name = "phone_number")
    private String number;
 
    @ManyToOne
    //@JsonBackReference
    @JsonIgnoreProperties(value = {"phones"})
    @JoinColumns({
        @JoinColumn(
            name = "company_id",
            referencedColumnName = "company_id"),
        @JoinColumn(
            name = "employee_number",
            referencedColumnName = "employee_number")
    })
    private Employee employee;

    
    
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Phone(String number, Employee employee) {
		super();
		this.number = number;
		this.employee = employee;
	}



	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

    
    
}
