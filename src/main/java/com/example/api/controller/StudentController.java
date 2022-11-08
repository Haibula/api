package com.example.api.controller;

import com.example.api.model.Students;
import com.example.api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("v1/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    public List<Students> list() {
        return studentService.list();
    }

    @PostMapping("/item")
    public List<Students> add(@RequestBody Students students) {
        studentService.add(students);
        return studentService.list();
    }
}
