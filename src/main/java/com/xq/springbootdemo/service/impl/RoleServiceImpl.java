package com.xq.springbootdemo.service.impl;

import com.xq.springbootdemo.dao.RoleMapper;
import com.xq.springbootdemo.domain.Permission;
import com.xq.springbootdemo.domain.Role;
import com.xq.springbootdemo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public boolean insRole(Role role) {
        return roleMapper.insRole(role);
    }

    @Override
    public boolean delRole(int id) {
        return roleMapper.delRole(id);
    }

    @Override
    public boolean updRole(Role role) {
        return roleMapper.updRole(role);
    }

    @Override
    public Role selRole(int id) {
        return roleMapper.selRole(id);
    }

    @Override
    public List<Permission> getPermissionByRoleId(int id) {
        return roleMapper.getPermissionByRoleId(id);
    }
}
