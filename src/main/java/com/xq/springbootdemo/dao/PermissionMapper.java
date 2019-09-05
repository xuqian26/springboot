package com.xq.springbootdemo.dao;
import com.xq.springbootdemo.domain.Permission;
import org.springframework.stereotype.Repository;

@Repository
public interface PermissionMapper {
    boolean insPer(Permission per);
    boolean delPer(int id);
    boolean updPer(Permission per);
    Permission selPer(int id);
}
