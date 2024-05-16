package com.student.dashboard.service;

import com.student.dashboard.model.Student_details;

import java.util.List;

public interface Student_detailsService {
    public Student_details saveStudent(Student_details student_details);
    public List<Student_details>getAllStudent_details();
}
