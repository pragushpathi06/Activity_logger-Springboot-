package com.student.dashboard.controller;


import com.student.dashboard.model.Student_personal;
import com.student.dashboard.service.Student_personalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student_personal")
public class Student_personalController {
    @Autowired
    private Student_personalService student_personalService;

    @PostMapping("/add")
    public String add(@RequestBody Student_personal student_personal){
        student_personalService.saveStudent(student_personal);
        return "New student is add personal";
    }
    @GetMapping("/getAll")
    public List<Student_personal>getAllStudent_personal(){
        return student_personalService.getAllStudent_personal();
    }
}
