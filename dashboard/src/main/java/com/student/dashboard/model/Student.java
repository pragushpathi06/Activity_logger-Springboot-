package com.student.dashboard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String student_name;
    private String student_rollno;
    private String student_emailid;
    private String student_password;
    private String role;

    public Student() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_rollno() {
        return student_rollno;
    }

    public void setStudent_rollno(String student_rollno) {
        this.student_rollno = student_rollno;
    }

    public String getStudent_emailid() {
        return student_emailid;
    }

    public void setStudent_emailid(String student_emailid) {
        this.student_emailid = student_emailid;
    }

    public String getStudent_password() {
        return student_password;
    }

    public void setStudent_password(String student_password) {
        this.student_password = student_password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
