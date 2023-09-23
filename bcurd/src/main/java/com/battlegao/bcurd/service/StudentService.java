package com.battlegao.bcurd.service;

import com.battlegao.bcurd.entity.Student;
import com.battlegao.bcurd.mapper.StudentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author BattleGao
 * @Admin 智博程序园
 */
@Service
public class StudentService {
    @Resource
    private StudentMapper studentMapper;

    // 查询
    public List<Student> getStudents(){
        return studentMapper.getStudents();
    }

    // 删除
    public void delStudent(int id){
        studentMapper.delStudent(id);
    }

    // 修改
    public void updateStudent(Student student){
        studentMapper.updateStudent(student);
    }

    // 新增
    public void addStudent(Student student){
        studentMapper.addStudent(student);
    }

    // 模糊查询
    public List<Student> findStudentByName(String name){
        return studentMapper.findStudentByName(name);
    }
}
