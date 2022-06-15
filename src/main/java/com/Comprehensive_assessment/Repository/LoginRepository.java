package com.Comprehensive_assessment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Comprehensive_assessment.Entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {

	public Login findByEmail(String email);

}
