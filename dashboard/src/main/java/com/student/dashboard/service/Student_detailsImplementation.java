package com.student.dashboard.service;

import com.student.dashboard.model.Student_details;
import com.student.dashboard.repository.Student_detailsRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Student_detailsImplementation implements Student_detailsService{
    @Autowired
    private Student_detailsRespository student_detailsRespository;
    @Override
    public Student_details saveStudent(Student_details student_details){
        return student_detailsRespository.save(student_details);
    }

    @Override
    public List<Student_details> getAllStudent_details() {
        return student_detailsRespository.findAll();
    }
}
