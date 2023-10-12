package com.battlegao.library.service.impl;

import com.battlegao.library.domain.Student;
import com.battlegao.library.mapper.StudentMapper;
import com.battlegao.library.service.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author BattleGao
 * @Admin 智博程序园
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    StudentMapper studentMapper;

    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    public int deleteStudent(int id) {
        return studentMapper.deleteStudent(id);
    }

    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    public List<Student> findAllStudent() {
        return studentMapper.findAllStudent();
    }

    public List<Student> findStudentByNum(int studentNum) {
        return studentMapper.findStudentByNum(studentNum);
    }

    public List<Student> findStudentByName(String studentName) {
        return studentMapper.findStudentByName(studentName);
    }
}
