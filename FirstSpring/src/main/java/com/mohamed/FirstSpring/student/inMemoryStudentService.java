package com.mohamed.FirstSpring.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service("im")
public class inMemoryStudentService implements StudentService {

    private final inMemoryStudentDao dao;

    public inMemoryStudentService(inMemoryStudentDao dao) {
        this.dao = dao;
    }

    @Override
    public Student save(Student s) {
        return dao.save(s);
    }

    @Override
    public List<Student> findAllStudents() {
        return dao.findAllStudents();

    }

    @Override
    public Student findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public Student update(Student s) {
        return dao.update(s);
    }

    @Override
    public void delete(String email) {
         dao.delete(email);
    }
}
