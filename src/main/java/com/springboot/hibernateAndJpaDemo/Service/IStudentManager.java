package com.springboot.hibernateAndJpaDemo.Service;

import com.springboot.hibernateAndJpaDemo.entities.Student;

import java.util.List;

public interface IStudentManager {
    List<Student> getStudents();
    Student getStudentById(int studentId);
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Student student);
}
