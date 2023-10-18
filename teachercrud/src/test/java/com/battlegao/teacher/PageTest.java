package com.battlegao.teacher;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import com.battlegao.teacher.domain.Teacher;
import com.battlegao.teacher.mapper.TeacherMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PageTest {

    @Autowired
    private TeacherMapper teacherMapper;

    @Test
    void selectPage(){
        LambdaQueryWrapper<Teacher> lambdaQueryWrapper = new LambdaQueryWrapper<>();
        //指定分页对象，分页对象包含分页信息 IPage
        IPage<Teacher> userPage = new Page<>(2, 3);
        //执行查询
        teacherMapper.selectPage(userPage,lambdaQueryWrapper);

        //获取分页查询的信息
        System.out.println("当前页:" + userPage.getCurrent());
        System.out.println("每页显示条数:" + userPage.getSize());
        System.out.println("总页数:" + userPage.getPages());
        System.out.println("总条数:" + userPage.getTotal());
        System.out.println("分页数据:" + userPage.getRecords());
    }


}
