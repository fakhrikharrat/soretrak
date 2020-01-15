package com.soretrak.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.soretrak.model.Phone;

public interface PhoneRepository extends JpaRepository<Phone, String> {

}
