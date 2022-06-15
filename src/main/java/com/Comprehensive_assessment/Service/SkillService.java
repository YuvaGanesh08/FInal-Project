package com.Comprehensive_assessment.Service;

import java.util.Optional;

import org.springframework.stereotype.Component;

import com.Comprehensive_assessment.Entity.Skill;

@Component
public interface SkillService {
	
	public Skill saveskill(Skill skill);

	public Optional<Skill> findBySId(int id);
}
