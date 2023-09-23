package com.battlegao.bcurd.controller;

import com.battlegao.bcurd.entity.Student;
import com.battlegao.bcurd.service.StudentService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

/**
 * @Author BattleGao
 * @Admin 智博程序园
 */

@RestController
@RequestMapping(value = "/student")
public class StudentController {
    @Resource
    private StudentService studentService;

    @RequestMapping(value = "/addStudent")
    public String addStudent(@RequestBody Student student){
        try {
            studentService.addStudent(student);
            return "添加成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "添加失败";
        }
    }

    @RequestMapping(value = "/updateStudent")
    @ResponseBody
    public String updateStudent(@RequestBody Student student){
        try {
            studentService.updateStudent(student);
            return "更新成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "更新失败";
        }
    }

    @RequestMapping(value = "/delStudent")
    @ResponseBody
    public String delStudent(int id){
        try {
            studentService.delStudent(id);
            return "删除成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "删除失败";
        }
    }

    @RequestMapping(value = "/getStudents")
    @ResponseBody
    public List<Student> getStudents(){
        try {
            List<Student> students = studentService.getStudents();
            return students;
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

    @RequestMapping(value = "/findStudentByName")
    @ResponseBody
    public List<Student> findStudentByName(String name){
        try {
            List<Student> students =  studentService.findStudentByName(name);
            return students;
        } catch (Exception e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }
}
