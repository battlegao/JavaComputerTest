package com.battlegao.mycrud.service.impl;

import com.battlegao.mycrud.dao.UserDao;
import com.battlegao.mycrud.pojo.User;
import com.battlegao.mycrud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public int save(User user) {
        return userDao.save(user);
    }

    @Override
    public int delete(int id) {
        return userDao.delete(id);
    }

    @Override
    public User get(int id) {
        return userDao.get(id);
    }

    @Override
    public int updateById(User user) {
        return userDao.updateById(user);
    }

}

