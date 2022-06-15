package com.Comprehensive_assessment.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Comprehensive_assessment.Entity.Skill;
import com.Comprehensive_assessment.Service.SkillService;


@CrossOrigin(origins = "*")
@RestController
public class SkillController {

	@Autowired
	private SkillService skillService;

	@GetMapping("/addSkill/{id}")
	public ResponseEntity<Optional<Skill>> getSkillById(@PathVariable int id) throws Exception {
		Optional<Skill> skill = skillService.findBySId(id);
		return ResponseEntity.ok(skill);
	}
	
	@PostMapping("/addSkill")
	public Skill addSkill(@RequestBody Skill skill) throws Exception {
		Skill skills = new Skill(skill.getsId(), skill.getsTitle(), skill.getsCategory(), skill.getsDesc());
		skills = skillService.saveskill(skills);
		return skills;
	}
	
	@PutMapping("/addSkillDel")
	public Skill deleteSkill(@RequestBody Skill skill) throws Exception {
		Skill skills = new Skill(skill.getsId(), "", "", "");
		skills = skillService.saveskill(skills);
		return skills;
	}
}
