package com.xq.springbootdemo.service;

import com.xq.springbootdemo.domain.Permission;
import com.xq.springbootdemo.domain.Role;

import java.util.List;

public interface RoleService {
    boolean insRole(Role role);
    boolean delRole(int id);
    boolean updRole(Role role);
    Role selRole(int id);
    List<Permission> getPermissionByRoleId(int id);
}
