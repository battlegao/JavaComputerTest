package com.battlegao.studentcurd.controller;

import com.battlegao.studentcurd.entity.Student;
import com.battlegao.studentcurd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable Integer id) {
        return studentService.findById(id);
    }

    @PostMapping("/insert")
    public void insert(@RequestBody Student student) {
        studentService.insert(student);
    }

    @PutMapping("/update")
    public void update(@RequestBody Student student) {
        studentService.update(student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        studentService.delete(id);
    }
}
