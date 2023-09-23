package com.battlegao.studentcurd.service;

import com.battlegao.studentcurd.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(Integer id);
    void insert(Student student);
    void update(Student student);
    void delete(Integer id);
}
