package com.Comprehensive_assessment.Service.Impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Comprehensive_assessment.Entity.Skill;
import com.Comprehensive_assessment.Repository.SkillRepository;
import com.Comprehensive_assessment.Service.SkillService;

@Service
public class SkillServiceImpl implements SkillService {
	
	@Autowired
	public SkillRepository skillrepository;
	
	@Override
	public Skill saveskill(Skill skill) {

		return skillrepository.save(skill);
	}

	@Override
	public Optional<Skill> findBySId(int id) {
		Optional<Skill> skl=skillrepository.findById(id);
		return skl ;
	}
}
