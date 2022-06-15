package com.Comprehensive_assessment.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.Comprehensive_assessment.Entity.Employee;


@Component
public interface EmployeeService {
	public Employee saveEmployee(Employee emp);
	
	public List<Employee> getEmployeeList();
	
	public Optional<Employee> findById(int id);
}
