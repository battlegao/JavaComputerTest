package com.battlegao.acurd.service;


import com.battlegao.acurd.entity.User;
import com.battlegao.acurd.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:	实现类，对进行相关的业务逻辑
 * @author: Fish_Vast
 * @Date: 2021/8/25
 * @version: 1.0
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUser(int id){
        return userMapper.getUser(id);
    }

    public int delete(int id){
        return userMapper.delete(id);
    }

    public int update(User user){
        return userMapper.update(user);
    }

    public int save(User user){
        return userMapper.save(user);
    }

    public List<User>  selectAll(){
        return userMapper.selectAll();
    }
}
