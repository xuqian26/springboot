package com.xq.springbootdemo.service;

import com.xq.springbootdemo.domain.Role;
import com.xq.springbootdemo.domain.User;

import java.util.List;

public interface UserService {
    boolean insUser(User user);
    boolean delUser(int id);
    boolean updUser(User user);
    User selUser(int id);
    List<Role> getRoleByUserName(String name);
    User selectByName(String name);
}
