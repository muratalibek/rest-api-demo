package com.example.api.students;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfiguration {

    @Bean
    public CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            studentRepository.saveAll(List.of(
                    new Student("Aynur", 25, "female", LocalDate.of(2006, Month.DECEMBER, 19)),
                    new Student( "Alia", 19, "female", LocalDate.of(2006, Month.DECEMBER, 19))));
        };
    }
}
