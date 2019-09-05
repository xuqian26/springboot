package com.xq.springbootdemo.dao;

import com.xq.springbootdemo.domain.Permission;
import com.xq.springbootdemo.domain.Role;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleMapper {
    boolean insRole(Role role);
    boolean delRole(int id);
    boolean updRole(Role role);
    Role selRole(int id);
    List<Permission> getPermissionByRoleId(int id);
}
