package com.Comprehensive_assessment.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class Login {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	
	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String password;

	private String role;
	
	private String empName;

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Login(int empId, String email, String password, String role, String empName) {
		super();
		this.empId = empId;
		this.email = email;
		this.password = password;
		this.role = role;
		this.empName = empName;
	}

	public Login(String email, String password,String role,String empName) {
		super();
		this.email = email;
		this.password = password;
		this.role = role;
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Login [empId=" + empId + ", email=" + email + ", password=" + password + ", role=" + role + ", empName="
				+ empName + "]";
	}

	
	
	
	
}
