package com.restapi.sb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.sb.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
                      
	   
}
