package com.schoolmanagement.software.dto;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "StudentDetails")
public class Studentdetails2 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    Integer studentId;

    @Column(nullable = false)
    String studentName;

    @Column(nullable = false)
    Date DOB;

    @Column
   String previousSchool;

    @Column(nullable = false)
    String homeAddress;

    @Column
    String fatherName;

    @Column
    String motherName;

    @Column(nullable = false)
    Long fatherMobileNumber;

    @Column
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

    public void setDOB(Date DOB) {
    	
        this.DOB = DOB;
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
