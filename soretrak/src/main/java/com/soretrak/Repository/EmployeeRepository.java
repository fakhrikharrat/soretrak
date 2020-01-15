package com.soretrak.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.soretrak.model.Dragent;
import com.soretrak.model.Employee;
import com.soretrak.model.EmployeeId;

public interface EmployeeRepository extends JpaRepository<Employee, EmployeeId> {

	@Query(value ="select * from employee a where a.company_id=?1 ", nativeQuery = true)
	List<Employee> findByCompanyId(Long companyid);
}
