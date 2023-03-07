package com.restapi.sb.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.sb.model.Employee;
import com.restapi.sb.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	public EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees(){
		List<Employee> emp = new ArrayList<>();
		employeeRepository.findAll().forEach(emp::add);
		return emp;
		}


   public void addEmployee(Employee employee) {
	  employeeRepository.save(employee);
}


    public void updateEmployee(long id, Employee employee) {
	employeeRepository.save(employee);
}


	public void deleteEmployee(long id) {
		employeeRepository.deleteById(id);		
	}



}