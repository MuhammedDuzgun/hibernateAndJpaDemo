package com.springboot.hibernateAndJpaDemo.controllers;

import com.springboot.hibernateAndJpaDemo.services.IStudentService;
import com.springboot.hibernateAndJpaDemo.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentController {

    private IStudentService studentManager;

    @Autowired
    public StudentController(IStudentService studentManager) {
        this.studentManager = studentManager;
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return studentManager.getStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id) {
        return studentManager.getStudentById(id);
    }

    @PostMapping("/add-student")
    public void addStudent(@RequestBody Student student) {
        studentManager.addStudent(student);
    }

    @PostMapping("/update-student")
    public void updateStudedent(@RequestBody Student student) {
        studentManager.updateStudent(student);
    }

    @PostMapping("/delete-student")
    public void deleteStudent(@RequestBody Student student) {
        studentManager.deleteStudent(student);
    }

}
