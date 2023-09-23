
package com.battlegao.spdemo.controller;

import com.battlegao.spdemo.entity.User;
import com.battlegao.spdemo.mapper.usermapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class usercontroller {

    @Autowired
    private usermapper Usermapper;

    @GetMapping("/")
    public List<User> index() {
        return Usermapper.findall();
    }

}
