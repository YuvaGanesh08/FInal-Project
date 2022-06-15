package com.Comprehensive_assessment.Entity;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="skills")
public class Skill {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int sId;
	private String sTitle;
	private String sCategory;
	private String sDesc;
	
	@OneToOne(fetch=FetchType.LAZY, cascade = CascadeType.ALL,mappedBy="skill")
	private Employee employee;
	
	public Skill(int sId, String sTitle, String sCategory, String sDesc) {
		super();
		this.sId = sId;
		this.sTitle = sTitle;
		this.sCategory = sCategory;
		this.sDesc = sDesc;
		
	}

	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Skill(String sTitle, String sCategory, String sDesc) {
		super();
		
		this.sTitle = sTitle;
		this.sCategory = sCategory;
		this.sDesc = sDesc;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsTitle() {
		return sTitle;
	}

	public void setsTitle(String sTitle) {
		this.sTitle = sTitle;
	}

	public String getsCategory() {
		return sCategory;
	}

	public void setsCategory(String sCategory) {
		this.sCategory = sCategory;
	}

	public String getsDesc() {
		return sDesc;
	}

	public void setsDesc(String sDesc) {
		this.sDesc = sDesc;
	}

	@Override
	public String toString() {
		return "Skill [sId=" + sId + ", sTitle=" + sTitle + ", sCategory=" + sCategory + ", sDesc=" + sDesc + "]";
	}
	
	
}
