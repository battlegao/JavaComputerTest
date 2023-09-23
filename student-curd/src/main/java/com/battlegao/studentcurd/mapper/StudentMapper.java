
package com.battlegao.studentcurd.mapper;

import com.battlegao.studentcurd.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("SELECT * FROM students")
    List<Student> findAll();

    @Select("SELECT * FROM students WHERE id = #{id}")
    Student findById(Integer id);

    @Insert("INSERT INTO students(name, age, gender) VALUES(#{name}, #{age}, #{gender})")
    void insert(Student student);

    @Update("UPDATE students SET name=#{name}, age=#{age}, gender=#{gender} WHERE id=#{id}")
    void update(Student student);

    @Delete("DELETE FROM students WHERE id=#{id}")
    void delete(Integer id);
}
