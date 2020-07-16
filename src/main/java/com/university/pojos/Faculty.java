package com.university.pojos;

//import javax.persistence.Entity;
//import javax.persistence.Id;

//@Entity
public class Faculty {
	
	//@Id
	private Long FcollegeCode;
	private String FacultyName;
	private String Fsubject;
	private String FacultyGender;
	
	public Long getFcollegeCode() {
		return FcollegeCode;
	}
	public void setFcollegeCode(Long fcollegeCode) {
		FcollegeCode = fcollegeCode;
	}
	public String getFacultyName() {
		return FacultyName;
	}
	public void setFacultyName(String facultyName) {
		FacultyName = facultyName;
	}
	public String getFsubject() {
		return Fsubject;
	}
	public void setFsubject(String fsubject) {
		Fsubject = fsubject;
	}
	public String getFacultyGender() {
		return FacultyGender;
	}
	public void setFacultyGender(String facultyGender) {
		FacultyGender = facultyGender;
	}
	
}
