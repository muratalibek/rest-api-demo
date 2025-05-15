package com.example.api.students;

import com.example.api.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {


    public List<Student> list() {
        return List.of(
                new Student(1L, "Alex", 25, "male", LocalDate.of(2000, Month.MARCH, 21)),
                new Student(2L, "Pam", 24, "female", LocalDate.of(1999, Month.DECEMBER, 11)),
                new Student(3L, "Carl", 23, "male", LocalDate.of(1998, Month.JUNE, 13)),
                new Student(4L, "Dave", 22, "male", LocalDate.of(1997, Month.JANUARY, 14))
        );
    }
}
