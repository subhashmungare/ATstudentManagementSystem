package com.spring.ATdevProject.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ATstudent {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int id;
	String studentName;
	String emailid;
	Long ContactNum;
	String department;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public Long getContactNum() {
		return ContactNum;
	}
	public void setContactNum(Long contactNum) {
		ContactNum = contactNum;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "ATstudent [id=" + id + ", studentName=" + studentName + ", emailid=" + emailid + ", ContactNum="
				+ ContactNum + ", department=" + department + "]";
	}
	
	
}
