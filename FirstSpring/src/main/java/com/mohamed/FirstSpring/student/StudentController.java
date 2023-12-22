package com.mohamed.FirstSpring.student;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
public class StudentController {

    private final StudentService studentservice;

    public StudentController(
           @Qualifier("db") StudentService studentservice
    ) {
        this.studentservice = studentservice;
    }

    @PostMapping
    public Student save (
            @RequestBody Student student
    ) {
        return studentservice.save(student);
    }

    @GetMapping("/{email}")
    public Student findByEmail(
           @PathVariable("email") String email
    ){
        return studentservice.findByEmail(email);
    }

    @GetMapping
    public List<Student> findAllStudents() {
        return studentservice.findAllStudents();
    }

    @PutMapping
    public Student updateStudent(
            @RequestBody Student student
    ){
        return studentservice.update(student);
    }

    @DeleteMapping("/{email}")
    public void delete(
          @PathVariable("email") String email
    ){
        studentservice.delete(email);
    }

}
