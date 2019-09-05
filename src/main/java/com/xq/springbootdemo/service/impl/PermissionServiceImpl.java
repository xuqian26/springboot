package com.xq.springbootdemo.service.impl;

import com.xq.springbootdemo.dao.PermissionMapper;
import com.xq.springbootdemo.domain.Permission;
import com.xq.springbootdemo.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public boolean insPer(Permission per) {
        return permissionMapper.insPer(per);
    }

    @Override
    public boolean delPer(int id) {
        return permissionMapper.delPer(id);
    }

    @Override
    public boolean updPer(Permission per) {
        return permissionMapper.updPer(per);
    }

    @Override
    public Permission selPer(int id) {
        return permissionMapper.selPer(id);
    }
}
