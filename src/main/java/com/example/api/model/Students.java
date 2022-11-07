package com.example.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.Month;

@Entity
public class Students {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private LocalDate dob;

    public Students() {
    }

    public Students(String name, LocalDate dob) {
        this.name = name;
        this.dob = dob;
    }

    public Students(Long id, String name, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
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

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                '}';
    }
}
