package com.example.api.students;

import jakarta.persistence.*;

import javax.sound.midi.Sequence;
import java.time.LocalDate;

@Entity
public class Student {

    @Id
    @SequenceGenerator(
          name = "student_sequence",
          sequenceName = "student_sequence",
            allocationSize = 1)
    @GeneratedValue(
          strategy = GenerationType.SEQUENCE,
          generator = "student_sequence")
//    @Id
//    @SequenceGenerator(
//            name = "student_sequence",
//            sequenceName = "student_sequence",
//            allocationSize = 1
//    )
//    @GeneratedValue(
//            strategy = GenerationType.SEQUENCE,
//            generator = "student_sequence"
//    )
    private Long id;
    private String name;
    private int age;
    private String gender;
    private LocalDate birthDate;

    public Student() {
    }

    public Student(Long id, String name, int age, String gender, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.birthDate = birthDate;
    }
    public Long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public LocalDate getBirthDate() {
        return birthDate;
    }
    public String getGender() {
        return gender;
    }
}
