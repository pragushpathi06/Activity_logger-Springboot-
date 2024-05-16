package com.student.dashboard.controller;

import com.student.dashboard.model.Student_details;
import com.student.dashboard.service.Student_detailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student_details")
public class Student_detailsController {
    @Autowired
    private Student_detailsService student_detailsService;

    @PostMapping("/add")
    public String add(@RequestBody Student_details student_details) {
        student_detailsService.saveStudent(student_details);
        return "New student is added dude";
    }
    @GetMapping("/getAll")
    public List<Student_details> getAllStudent_details(){
        return student_detailsService.getAllStudent_details();
    }
}
