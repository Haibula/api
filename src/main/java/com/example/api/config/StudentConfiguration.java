package com.example.api.config;

import com.example.api.model.Students;
import com.example.api.repo.StudentRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Objects;

@Controller
public class StudentConfiguration {
    @Bean
    public CommandLineRunner commandLineRunner(StudentRepositories studentRepositories) {
        return args -> {
            List<Students> listStudents = studentRepositories.findAll();
            if (listStudents.isEmpty()) {
                studentRepositories.saveAll(List.of(
                        new Students("Ale1x", LocalDate.of(1999, Month.FEBRUARY, 12)),
                        new Students("Tom", LocalDate.of(2001, Month.APRIL, 16))));
            }
            for (Students s : listStudents) {
                if (listStudents.stream().filter(u -> Objects.equals(u.getName(), s.getName())).findFirst().isPresent()) {
                } else {
                    studentRepositories.saveAll(List.of(
                            new Students("Ale1x", LocalDate.of(1999, Month.FEBRUARY, 12)),
                            new Students("Tom", LocalDate.of(2001, Month.APRIL, 16))));
                }

            }
        };
    }

}
