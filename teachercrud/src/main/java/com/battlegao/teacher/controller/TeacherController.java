package com.battlegao.teacher.controller;

import com.battlegao.teacher.domain.Teacher;
import com.battlegao.teacher.mapper.TeacherMapper;
import com.battlegao.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author BattleGao
 * @Admin 智博程序园
 */
@RestController
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @Autowired
    private TeacherMapper teacherMapper;

    @RequestMapping("/selectList")
    public List<Teacher> selectList(){

        List<Teacher> teachers = teacherMapper.selectList(null);
        System.out.println(teachers);
        return teachers;

    }

}
