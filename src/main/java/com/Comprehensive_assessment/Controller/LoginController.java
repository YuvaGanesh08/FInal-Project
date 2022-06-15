package com.Comprehensive_assessment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.Comprehensive_assessment.Entity.Login;
import com.Comprehensive_assessment.Service.LoginService;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;

	@PostMapping("/login")
	public Login checkPerson(@RequestBody Login login) throws Exception {
		String email = login.getEmail();
		String password = login.getPassword();
		Login loginUser = loginService.findByEmail(email);
		if (loginUser != null) {
			if (loginUser.getEmail().equalsIgnoreCase(email) && loginUser.getPassword().equalsIgnoreCase(password)) {
				System.out.println("Correct user");
				return loginUser;
			}
		} else {
			System.out.println("Invalid User");
			throw new Exception("User doesn't match");
		}
		return null;

	}

}