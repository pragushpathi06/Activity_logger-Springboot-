package com.student.dashboard.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Student_details {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String student_name;
    private String student_roll;
    private String student_status;
    private String current_sem;
    private String department;
    private String special_lab;
    private String warden;
    private String attendance_percentage;
    private String hosteller_or_days;
    private int no_of_leave;
    private int no_of_days_present;
    private int total_days;
    private String academic_performance;
    private String student_personal_email_id;
    private String student_official_email_id;
    private String student_mobile_no;
    public Student_details() {
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_roll() {
        return student_roll;
    }

    public void setStudent_roll(String student_roll) {
        this.student_roll = student_roll;
    }

    public String getStudent_status() {
        return student_status;
    }

    public void setStudent_status(String student_status) {
        this.student_status = student_status;
    }

    public String getCurrent_sem() {
        return current_sem;
    }

    public void setCurrent_sem(String current_sem) {
        this.current_sem = current_sem;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpecial_lab() {
        return special_lab;
    }

    public void setSpecial_lab(String special_lab) {
        this.special_lab = special_lab;
    }

    public String getWarden() {
        return warden;
    }

    public void setWarden(String warden) {
        this.warden = warden;
    }

    public String getHosteller_or_days() {
        return hosteller_or_days;
    }

    public void setHosteller_or_days(String hosteller_or_days) {
        this.hosteller_or_days = hosteller_or_days;
    }

    public String getAttendance_percentage() {
        return attendance_percentage;
    }

    public void setAttendance_percentage(String attendance_percentage) {
        this.attendance_percentage = attendance_percentage;
    }

    public int getNo_of_leave() {
        return no_of_leave;
    }

    public void setNo_of_leave(int no_of_leave) {
        this.no_of_leave = no_of_leave;
    }

    public int getNo_of_days_present() {
        return no_of_days_present;
    }

    public void setNo_of_days_present(int no_of_days_present) {
        this.no_of_days_present = no_of_days_present;
    }

    public int getTotal_days() {
        return total_days;
    }

    public void setTotal_days(int total_days) {
        this.total_days = total_days;
    }

    public String getAcademic_performance() {
        return academic_performance;
    }

    public void setAcademic_performance(String academic_performance) {
        this.academic_performance = academic_performance;
    }

    public String getStudent_personal_email_id() {
        return student_personal_email_id;
    }

    public void setStudent_personal_email_id(String student_personal_email_id) {
        this.student_personal_email_id = student_personal_email_id;
    }

    public String getStudent_official_email_id() {
        return student_official_email_id;
    }

    public void setStudent_official_email_id(String student_official_email_id) {
        this.student_official_email_id = student_official_email_id;
    }

    public String getStudent_mobile_no() {
        return student_mobile_no;
    }

    public void setStudent_mobile_no(String student_mobile_no) {
        this.student_mobile_no = student_mobile_no;
    }


}
