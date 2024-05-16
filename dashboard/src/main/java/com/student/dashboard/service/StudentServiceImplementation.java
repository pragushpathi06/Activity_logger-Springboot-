package com.student.dashboard.service;

import com.student.dashboard.model.Student;
import com.student.dashboard.repository.StudentRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService{
    @Autowired
    private StudentRespository studentRespository;
    @Override
    public Student saveStudent(Student student) {
        return studentRespository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRespository.findAll();
    }
}
