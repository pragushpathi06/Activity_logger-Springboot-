package com.student.dashboard.service;

import com.student.dashboard.model.Student_personal;

import java.util.List;

public interface Student_personalService {
    public Student_personal saveStudent(Student_personal student_personal);
    public List<Student_personal>getAllStudent_personal();
}
