package com.Comprehensive_assessment.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Comprehensive_assessment.Entity.Login;
import com.Comprehensive_assessment.Repository.LoginRepository;
import com.Comprehensive_assessment.Service.LoginService;



@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository loginRepository;

	@Override
	public Login findByEmail(String email) {

		return loginRepository.findByEmail(email);
	}

	@Override
	public void saveLogin(Login login) {
		loginRepository.save(login);

	}

}
