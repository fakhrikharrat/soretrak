package com.soretrak.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import com.soretrak.model.EmployeeLast;
@Repository
public interface EmployeeLastRepository extends JpaRepository<EmployeeLast, Long> {

	
}
