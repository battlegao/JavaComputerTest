package com.battlegao.mycrud;

import com.battlegao.mycrud.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MycrudApplicationTests {

    @Autowired
    private UserDao userDao;
    @Test
    void contextLoads(){
        System.out.println(userDao.findAll());
    }

}
