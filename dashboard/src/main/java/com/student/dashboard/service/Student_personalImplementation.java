package com.student.dashboard.service;


import com.student.dashboard.model.Student_personal;
import com.student.dashboard.repository.Student_personalRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Student_personalImplementation implements Student_personalService{
    @Autowired
    private Student_personalRespository student_personalRespository;
    @Override
    public Student_personal saveStudent(Student_personal student_personal){
        return student_personalRespository.save(student_personal);
    }
    @Override
    public List<Student_personal>getAllStudent_personal(){
        return student_personalRespository.findAll();
    }
}
