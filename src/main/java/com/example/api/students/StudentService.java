package com.example.api.students;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> list() {

        return studentRepository.findAll();
    }

    public void add(Student student) {

        studentRepository.save(student);
    }
    public void delete(Long id) {
        studentRepository.deleteById(id);
    }

    public void update(Student student) {
        Optional<Student> row = studentRepository.findById(student.getId());
        if (row.isPresent()) {
            Student item = row.get();
            if (!student.getName().isEmpty()) {
                item.setName(student.getName());
            }
            if(student.getBirthDate() != null){
                item.setBirthDate(student.getBirthDate());
            }
            studentRepository.save(item);

        }
        studentRepository.save(student);
    }
}
