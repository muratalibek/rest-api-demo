package com.example.api;

import java.time.LocalDate;

public class Student {
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
