package com.example.api.students;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "/list")
    public List<Student> list() {
        return studentService.list();
    }

    @PostMapping(path = "/item")
    public List<Student> add(@RequestBody Student student) {
        studentService.add(student);
        return studentService.list();
    }
    @DeleteMapping(path = "item/{id}")
    public void delete(@PathVariable Long id) {
        studentService.delete(id);
    }

    @PutMapping(path = "/item")
    public void delete(@RequestBody Student student){
        studentService.update(student);
    }
}



