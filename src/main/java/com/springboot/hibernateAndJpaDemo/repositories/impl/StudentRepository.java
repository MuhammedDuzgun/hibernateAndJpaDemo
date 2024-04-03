package com.springboot.hibernateAndJpaDemo.repositories.impl;

import com.springboot.hibernateAndJpaDemo.repositories.IStudentDal;
import com.springboot.hibernateAndJpaDemo.entities.Student;
import jakarta.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentRepository implements IStudentDal {

    private EntityManager entityManager;

    @Autowired
    public StudentRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public List<Student> getStudents() {
        Session session = entityManager.unwrap(Session.class);
        List<Student> students = session.createQuery("from Student", Student.class).getResultList();
        return students;
    }

    @Override
    public Student getStudentById(int studentId) {
        Session session = entityManager.unwrap(Session.class);
        Student student = session.get(Student.class, studentId);
        return student;
    }

    @Override
    public void addStudent(Student student) {
        Session session = entityManager.unwrap(Session.class);
        session.merge(student);
    }

    @Override
    public void updateStudent(Student student) {
        Session session = entityManager.unwrap(Session.class);
        session.merge(student);
    }

    @Override
    public void deleteStudent(Student student) {
        Session session = entityManager.unwrap(Session.class);
        Student studentToDelete = session.get(Student.class, student.getId());
        session.remove(studentToDelete);
    }
}
