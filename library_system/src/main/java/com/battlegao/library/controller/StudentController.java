package com.battlegao.library.controller;

import com.battlegao.library.domain.Student;
import com.battlegao.library.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

/**
 * @Author BattleGao
 * @Admin 智博程序园
 */

@RestController //控制器注解
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping("/addStudent")
    public int addStudent(Student student) {
        //打印需要加入的书籍信息
        System.out.println(student);
        return  studentService.addStudent(student);
    }

    @RequestMapping("/findAllStudent")
    public List<Student> findAllStudent() {
        //返回json格式的数据，key构造为data
        return studentService.findAllStudent();
    }


}
