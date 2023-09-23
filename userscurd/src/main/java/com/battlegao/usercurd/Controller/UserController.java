package com.battlegao.usercurd.Controller;

import com.battlegao.usercurd.Entity.UserEntity;
import com.battlegao.usercurd.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    String message = "";
    @RequestMapping("/queryLimit")
    public List<UserEntity> queryLimit(@RequestParam("currentPage") Integer currentPage, @RequestParam("pageSize") Integer pageSize){
        return userService.queryLimit(currentPage,pageSize);
    }

    @PostMapping("/addUser")
    public String addUer(@RequestBody UserEntity user){
        //用Mybatis执行insert语句的时候，插入成功会返回1，不成功则会抛出异常，捕获一下异常就好
        try {
            userService.addUser(user);
            message = "增加用户成功";
        }catch (Exception exception){
            message = "增加用户异常";
        }
        return message;
    }

    @PutMapping("/updateUser")
    public String updateUser(@RequestBody UserEntity user){
        //Mybatis的更新操作成功返回1，用户不存在返回0，失败则抛异常
        try {
            message = userService.updateUser(user) == 1?"更新用户成功":"用户不存在，更新失败";
        }catch (Exception exception){
            message = "更新异常";
        }
        return message;
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(@RequestBody UserEntity user){
        //Mybatis的删除操作和更新返回值一样，成功返回1，用户不存在返回0，失败则抛异常
        try {
            message = userService.deleteUser(user) == 1?"删除用户成功":"用户不存在，删除失败";
        }catch (Exception exception){
            message = "删除异常";
        }
        return message;
    }
}