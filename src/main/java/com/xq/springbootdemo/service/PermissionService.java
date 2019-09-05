package com.xq.springbootdemo.service;

import com.xq.springbootdemo.domain.Permission;

public interface PermissionService {
    boolean insPer(Permission per);
    boolean delPer(int id);
    boolean updPer(Permission per);
    Permission selPer(int id);
}
