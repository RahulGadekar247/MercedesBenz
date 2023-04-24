package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class VintageCar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String vcid;
	
	private String vcName;
	
	private String vcEmail;

	private String vcpassword;

	private String vcTestcase;

	private String vcanswerStr;

	@Override
	public String toString() {
		return "VintageCar [id=" + id + ", vcid=" + vcid + ", vcName=" + vcName + ", vcEmail=" + vcEmail
				+ ", vcpassword=" + vcpassword + ", vcTestcase=" + vcTestcase + ", vcanswerStr=" + vcanswerStr + "]";
	}

	public VintageCar(long id, String vcid, String vcName, String vcEmail, String vcpassword, String vcTestcase,
			String vcanswerStr) {
		super();
		this.id = id;
		this.vcid = vcid;
		this.vcName = vcName;
		this.vcEmail = vcEmail;
		this.vcpassword = vcpassword;
		this.vcTestcase = vcTestcase;
		this.vcanswerStr = vcanswerStr;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVcid() {
		return vcid;
	}

	public void setVcid(String vcid) {
		this.vcid = vcid;
	}

	public String getVcName() {
		return vcName;
	}

	public void setVcName(String vcName) {
		this.vcName = vcName;
	}

	public String getVcEmail() {
		return vcEmail;
	}

	public void setVcEmail(String vcEmail) {
		this.vcEmail = vcEmail;
	}

	public String getVcpassword() {
		return vcpassword;
	}

	public void setVcpassword(String vcpassword) {
		this.vcpassword = vcpassword;
	}

	public String getVcTestcase() {
		return vcTestcase;
	}

	public void setVcTestcase(String vcTestcase) {
		this.vcTestcase = vcTestcase;
	}

	public String getVcanswerStr() {
		return vcanswerStr;
	}

	public void setVcanswerStr(String vcanswerStr) {
		this.vcanswerStr = vcanswerStr;
	}
	
	
	
	
	
	

}
