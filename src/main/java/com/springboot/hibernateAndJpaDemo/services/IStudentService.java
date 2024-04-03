package com.springboot.hibernateAndJpaDemo.services;

import com.springboot.hibernateAndJpaDemo.entities.Student;

import java.util.List;

public interface IStudentService {
    List<Student> getStudents();
    Student getStudentById(int studentId);
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Student student);
}
