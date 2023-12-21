package com.mohamed.FirstSpring.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudents() {
        return List.of(
                new Student(
                        "mohamed",
                        "boukthir",
                        LocalDate.now(),
                        "medboukthir@gmail.com",
                        22
                ),
                new Student(
                        "med med",
                        "med",
                        LocalDate.now(),
                        "medboukthir@gmail.com",
                        21
                )
        );
    }

}
