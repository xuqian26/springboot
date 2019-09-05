package com.xq.springbootdemo.controller;

import com.xq.springbootdemo.domain.User;
import com.xq.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService service;
    @RequestMapping("/insertUser")
    public Object insertUser(){
        User user=new User();
        user.setName("we");user.setPassword("1234");user.setSal(6000.00);
        boolean flag=service.insUser(user);
        return flag;
    }

    @GetMapping("/delUser/{id}")
    public Object delUser(@PathVariable int id){
        boolean flag=service.delUser(id);
        return flag;
    }

    @RequestMapping("/updUser")
    public Object updUser(){
        User user=new User();
        user.setId(2);user.setName("xq");user.setPassword("qwer");user.setSal(6000.00);
        boolean flag=service.updUser(user);
        return flag;
    }

    @GetMapping("/selUser/{id}")
    public Object selUser(@PathVariable int id){
        User user=service.selUser(id);
        return user;
    }
}
