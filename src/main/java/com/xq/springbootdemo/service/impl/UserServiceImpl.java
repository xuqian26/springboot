package com.xq.springbootdemo.service.impl;

import com.xq.springbootdemo.dao.UserMapper;
import com.xq.springbootdemo.domain.Role;
import com.xq.springbootdemo.domain.User;
import com.xq.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class UserServiceImpl implements UserService {
@Autowired
    private UserMapper userMapper;

    @Override
    public boolean insUser(User user) {
        return userMapper.insUser(user);
    }

    @Override
    public boolean delUser(int id) {
        return userMapper.delUser(id);
    }

    @Override
    public boolean updUser(User user) {
        return userMapper.updUser(user);
    }

    @Override
    public User selUser(int id) {
        return userMapper.selUser(id);
    }

    @Override
    public List<Role> getRoleByUserName(String name) {
        return userMapper.getRoleByUserName(name);
    }

    @Override
    public User selectByName(String name) {
        return userMapper.selectByName(name);
    }
}
