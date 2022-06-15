package com.Comprehensive_assessment.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empID;
	
	private String empName;
	private String empBio;
	private String empEmail;
	private String empPass;
	private String empRole;
	
	@OneToOne( cascade = CascadeType.ALL)
    @JoinColumn(name = "sId")
	private Skill skill;
	
	

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Employee(String empName, String empBio, String empEmail, String empPass, String empRole, Skill skill) {
		super();
		this.empName = empName;
		this.empBio = empBio;
		this.empEmail = empEmail;
		this.empPass = empPass;
		this.empRole = empRole;
		this.skill = skill;
	}


	public Employee(int empID, String empName, String empBio, String empEmail, String empPass, String empRole,
			Skill skill) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empBio = empBio;
		this.empEmail = empEmail;
		this.empPass = empPass;
		this.empRole = empRole;
		this.skill = skill;
		
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpBio() {
		return empBio;
	}

	public void setEmpBio(String empBio) {
		this.empBio = empBio;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpPass() {
		return empPass;
	}

	public void setEmpPass(String empPass) {
		this.empPass = empPass;
	}

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empBio=" + empBio + ", empEmail=" + empEmail
				+ ", empPass=" + empPass + ", empRole=" + empRole + ", skill=" + skill + "]";
	}

	
	
	
}
