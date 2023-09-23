package com.battlegao.myspdemo.mapper;

import com.battlegao.myspdemo.entity.userEntity;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface usermapper {

    @Select("select * from demo")  //查询所有数据
    List<userEntity> findALL();

    @Insert("INSERT into demo (username,password,address,email)VALUES(#{username},#{password},#{address},#{email})")
    Integer save(userEntity entity);

    Integer update(userEntity entity);

    @Delete("DELETE FROM demo where id=#{id}")
    Integer DELETE(Integer id);
}