package com.example.api.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

@Entity
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)

    private Long id;
    private String name;
    private LocalDate dob;
    private int age;

    public Students() {
    }

    public Students(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
        this.age = Period.between(dob,LocalDate.now()).getYears();
    }

    public Students(Long id, String name, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.age = Period.between(dob,LocalDate.now()).getYears();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';
    }
}
