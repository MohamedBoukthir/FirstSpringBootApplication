package com.mohamed.FirstSpring.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service("db")
public class DbStudentService implements StudentService {

    private final StudentRepository studentRepository;

    public DbStudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student save(Student s) {
        return studentRepository.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student findByEmail(String email) {
        return studentRepository.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return studentRepository.save(s);
    }

    @Override
    public void delete(String email) {
        studentRepository.deleteByEmail(email);
    }
}
