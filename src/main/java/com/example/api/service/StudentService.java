package com.example.api.service;

import com.example.api.model.Students;
import com.example.api.repo.StudentRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepositories studentRepositories;

    public List<Students> list() {
        return studentRepositories.findAll();
    }

    public void add(Students students) {
        students.setAge(Period.between(students.getDob(), LocalDate.now()).getYears());
        studentRepositories.save(students);
    }
}
