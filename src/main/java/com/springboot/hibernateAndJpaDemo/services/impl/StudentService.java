package com.springboot.hibernateAndJpaDemo.services.impl;

import com.springboot.hibernateAndJpaDemo.repositories.IStudentDal;
import com.springboot.hibernateAndJpaDemo.services.IStudentService;
import com.springboot.hibernateAndJpaDemo.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    private IStudentDal studentDal;

    @Autowired
    public StudentService(IStudentDal studentDal) {
        this.studentDal = studentDal;
    }

    @Override
    @Transactional
    public List<Student> getStudents() {
        return this.studentDal.getStudents();
    }

    @Override
    @Transactional
    public Student getStudentById(int studentId) {
        Student student = this.studentDal.getStudentById(studentId);
        return student;
    }

    @Override
    @Transactional
    public void addStudent(Student student) {
        this.studentDal.addStudent(student);
    }

    @Override
    @Transactional
    public void updateStudent(Student student) {
        this.studentDal.updateStudent(student);
    }

    @Override
    @Transactional
    public void deleteStudent(Student student) {
        this.studentDal.deleteStudent(student);
    }
}
