package com.Comprehensive_assessment.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Comprehensive_assessment.Entity.Employee;
import com.Comprehensive_assessment.Entity.Login;
import com.Comprehensive_assessment.Service.EmployeeService;
import com.Comprehensive_assessment.Service.LoginService;


@CrossOrigin(origins = "*")
@RestController
public class EmployeeController {

	@Autowired
	private LoginService loginService;
	@Autowired
	private EmployeeService empService;

	@PostMapping("/register")
	public Employee createEmployee(@RequestBody Employee emp) throws Exception {
		String email = emp.getEmpEmail();
		String password = emp.getEmpPass();
		String role= emp.getEmpRole();
		String empName=emp.getEmpName();
		Login loginUser = new Login(email, password, role, empName);
		loginService.saveLogin(loginUser);
		Employee employee = empService.saveEmployee(emp);
		return employee;

	}
	@GetMapping("/employee")
	public List<Employee> getAllEmployees() {
		List<Employee> employee=empService.getEmployeeList();
		return employee;
	}
	@GetMapping("/manager/{id}")
	public ResponseEntity<Optional<Employee>> getManagerById(@PathVariable int id) throws Exception {
		Optional<Employee> employee = Optional
				.of(empService.findById(id).orElseThrow(() -> new Exception("Person not found" + id)));
		return ResponseEntity.ok(employee);
	}

}