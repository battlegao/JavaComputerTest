package com.battlegao.usercurd.Dao;


import com.battlegao.usercurd.Entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
     List<UserEntity> queryLimit(Integer currentPage, Integer pageSize);

     Integer addUser(UserEntity user);

     Integer updateUser(UserEntity user);

     Integer deleteUser(UserEntity user);
}