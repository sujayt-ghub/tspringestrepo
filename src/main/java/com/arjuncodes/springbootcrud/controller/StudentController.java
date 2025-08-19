package com.arjuncodes.springbootcrud.controller;

import com.arjuncodes.springbootcrud.model.Student;
import com.arjuncodes.springbootcrud.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/getAll")
    public List<Student> list(){
        return studentService.listAll();

    }

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.save(student);
        return "New Student Added";

    }
}
