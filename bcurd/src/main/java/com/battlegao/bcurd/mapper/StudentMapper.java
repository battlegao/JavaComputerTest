package com.battlegao.bcurd.mapper;

import com.battlegao.bcurd.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author BattleGao
 * @Admin 智博程序园
 */
@Mapper
public interface StudentMapper {

    // 查询所有学生
    @Select("select * from student")
    List<Student> getStudents();

    // 通过姓名模糊查询学生
    @Select ("select * from student where name like concat('%',#{name},'%')")
    List<Student> findStudentByName(String name);

    // 删除
    @Delete("delete from student where id = #{id}")
    void delStudent(int id);

    // 新增
    @Insert("insert into student(id,name,birthday) values(#{id},#{name},#{birthday})")
    void addStudent(Student student);

    // 修改（更新）
    @Update("update student set name = #{name},birthday = #{birthday} where id = #{id} ")
    void updateStudent(Student student);
}
