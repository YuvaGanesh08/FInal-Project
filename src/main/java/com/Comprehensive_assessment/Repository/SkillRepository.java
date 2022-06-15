package com.Comprehensive_assessment.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Comprehensive_assessment.Entity.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer>{

	
}

