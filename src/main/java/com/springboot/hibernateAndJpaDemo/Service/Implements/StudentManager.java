package com.springboot.hibernateAndJpaDemo.Service.Implements;

import com.springboot.hibernateAndJpaDemo.DataAccessLayer.IStudentDal;
import com.springboot.hibernateAndJpaDemo.Service.IStudentManager;
import com.springboot.hibernateAndJpaDemo.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentManager implements IStudentManager {

    private IStudentDal studentDal;

    @Autowired
    public StudentManager(IStudentDal studentDal) {
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
