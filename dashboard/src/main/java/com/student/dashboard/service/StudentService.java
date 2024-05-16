package com.student.dashboard.service;

import com.student.dashboard.model.Student;
import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();
}
