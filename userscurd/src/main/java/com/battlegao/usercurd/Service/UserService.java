package com.battlegao.usercurd.Service;

import com.battlegao.usercurd.Dao.UserDao;
import com.battlegao.usercurd.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserService")
public class UserService {
    @Autowired
    private UserDao userDao;

    public List<UserEntity> queryLimit(Integer currentPage, Integer pageSzie){
        return userDao.queryLimit(currentPage,pageSzie);
    }

    public Integer addUser(UserEntity user){
        return userDao.addUser(user);
    }

    public Integer updateUser(UserEntity user){
        return userDao.updateUser(user);
    }

    public Integer deleteUser(UserEntity user){
        return userDao.deleteUser(user);
    }
}