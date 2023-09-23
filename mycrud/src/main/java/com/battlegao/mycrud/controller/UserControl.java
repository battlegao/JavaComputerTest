package com.battlegao.mycrud.controller;

import com.battlegao.mycrud.pojo.User;
import com.battlegao.mycrud.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class UserControl {

    @Autowired
    private UserService userService;
    
    //查询所有用户数据
    @GetMapping("/index.html")
    public String userList(Map<String, List> result) {
        List<User> users = userService.findAll();
        result.put("users", users);
        return "index";
    }
    
    //新增数据
    @PostMapping("/add")
    public String save(User user) {
        userService.save(user);
        return "redirect:/index.html";
    }
    
    //删除数据
    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable int id, HttpServletResponse servletResponse) throws IOException {
        userService.delete(id);
        System.out.println("----delete方法执行----");
        return "redirect:/index.html";
    }
    
    //根据id修改用户数据
    @GetMapping("/updatePage/{id}")
    public String updatePage(Model model, @PathVariable int id) {
        User users = userService.get(id);
        model.addAttribute("users", users);
        return "modify";
    }

    @PutMapping("/update")
    public String updateUser(Model model, User user, HttpServletRequest request) {
        String id = request.getParameter("id");
        User userById = userService.get(Integer.parseInt(id));
        userService.updateById(user);
        System.out.println(user);
        return "redirect:/index.html";
    }

}

