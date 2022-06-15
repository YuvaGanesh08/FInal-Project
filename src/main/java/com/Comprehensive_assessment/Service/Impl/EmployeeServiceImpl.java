package com.Comprehensive_assessment.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Comprehensive_assessment.Entity.Employee;
import com.Comprehensive_assessment.Entity.Skill;
import com.Comprehensive_assessment.Repository.EmployeeRepository;
import com.Comprehensive_assessment.Repository.SkillRepository;
import com.Comprehensive_assessment.Service.EmployeeService;



@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository empRepository;

	@Autowired
	private SkillRepository skillRepository;

	@Override
	public Employee saveEmployee(Employee emp) {
		Skill skill = emp.getSkill();
		emp = empRepository.save(emp);
		skill = skillRepository.save(skill);
		return emp;

	}

	@Override
	public List<Employee> getEmployeeList() {
		
		return empRepository.findAll();
	}
	
	public Optional<Employee> findById(int id){
		Optional<Employee> employee=empRepository.findById(id);
		return employee ;
	}
	


}
