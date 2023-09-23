package com.battlegao.myspdemo.controller;


import com.battlegao.myspdemo.entity.userEntity;
import com.battlegao.myspdemo.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class usercontroller {

    @Autowired
    private userservice UsersService;

    @GetMapping("/") //查询所有
    public List<userEntity> findall() {

        return UsersService.findall();
    }

    @PostMapping("/save")
    public Integer save(@RequestBody userEntity entity) {

        return UsersService.save(entity);
    }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id) {
        return UsersService.DELETE(id);
    }

}