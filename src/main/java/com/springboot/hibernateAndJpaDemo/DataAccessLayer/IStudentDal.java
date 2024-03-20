package com.springboot.hibernateAndJpaDemo.DataAccessLayer;

import com.springboot.hibernateAndJpaDemo.entities.Student;

import java.util.List;

public interface IStudentDal {
    List<Student> getStudents();
    Student getStudentById(int studentId);
    void addStudent(Student student);
    void updateStudent(Student student);
    void deleteStudent(Student student);

}
