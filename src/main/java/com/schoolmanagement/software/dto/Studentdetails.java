package com.schoolmanagement.software.dto;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Student_Details")
public class Studentdetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="student_id",nullable = false)
    Integer studentId;

    @Column(name="student_name",nullable = false)
    String studentName;

    @Column(name="dob",nullable = false)
    Date DOB;

    @Column(name="previous_school")
    String previousSchool;

    @Column(name="home_address",nullable = false)
    String homeAddress;

    @Column(name="father_name")
    String fatherName;

    @Column(name="mother_name")
    String motherName;

    @Column(name="father_mobile_number",nullable = false)
    Long fatherMobileNumber;

    @Column(name="mother_mobile_number")
    Long motherMobileNumber;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public String getPreviousSchool() {
		return previousSchool;
	}

	public void setPreviousSchool(String previousSchool) {
		this.previousSchool = previousSchool;
	}

	public String getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public Long getFatherMobileNumber() {
		return fatherMobileNumber;
	}

	public void setFatherMobileNumber(Long fatherMobileNumber) {
		this.fatherMobileNumber = fatherMobileNumber;
	}

	public Long getMotherMobileNumber() {
		return motherMobileNumber;
	}

	public void setMotherMobileNumber(Long motherMobileNumber) {
		this.motherMobileNumber = motherMobileNumber;
	}

    

}
