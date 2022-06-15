package com.Comprehensive_assessment.Service;

import org.springframework.stereotype.Component;

import com.Comprehensive_assessment.Entity.Login;



@Component
public interface LoginService {

	public void saveLogin(Login login);

	public Login findByEmail(String email);
	
}
