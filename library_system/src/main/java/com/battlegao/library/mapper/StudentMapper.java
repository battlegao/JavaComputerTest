package com.battlegao.library.mapper;

import com.battlegao.library.domain.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author BattleGao
 * @Admin 智博程序园
 */
@Mapper
public interface StudentMapper {

    int addStudent(Student student);

    //删除数据方法  根据学生ID删除
    int deleteStudent(int id);

    //修改数据方法  根据学生ID修改数据内容
    int updateStudent(Student student);

    //注：查询一条数据，Student和List<Student>都可以
    //注：查询多条数据，只能List<Student>
    //注：所以为了方便，统一使用List<Student>
    //查询数据方法  查询全部学生
    List<Student> findAllStudent();

    //查询数据方法  根据学号进行查询
    List<Student> findStudentByNum(int studentNum);

    //查询数据方法  根据学生姓名进行查询
    List<Student> findStudentByName(String studentName);

}
