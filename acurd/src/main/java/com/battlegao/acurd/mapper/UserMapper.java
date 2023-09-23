package com.battlegao.acurd.mapper;

import com.battlegao.acurd.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    //1.通过id查询用户信息
    User getUser(int id);
    //2.通过id删除用户信息
    int delete(int id);
    //3.更改用户信息
    int update(User user);
    //4.插入用户信息
    int save(User user);
    //5.查询所有用户信息
    List<User> selectAll();
}
