package com.xq.springbootdemo;

import com.xq.springbootdemo.domain.Permission;
import com.xq.springbootdemo.domain.Role;
import com.xq.springbootdemo.domain.User;
import com.xq.springbootdemo.service.PermissionService;
import com.xq.springbootdemo.service.RoleService;
import com.xq.springbootdemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTests {
@Autowired
public PermissionService service;
//测试Permission的查找
    @Test
    public void insertP() {
        Permission per=new Permission();per.setPermission("二级");per.setRole_id(2);
        service.insPer(per);
    }
    @Test
    public void deleteP(){
        service.delPer(2);
    }
    @Test
    public void updateP(){
        Permission per=new Permission();per.setId(1);per.setPermission("管理级");per.setRole_id(1);
        service.updPer(per);
    }
    @Test
    public void selectP(){
        service.selPer(1);
    }
    @Autowired
    public RoleService roleService;
    @Test
    public void insertR(){
        Role role=new Role();role.setUser_id(4);role.setRole_name("程序员");
        roleService.insRole(role);
    }
    @Test
    public void deleteR(){
        roleService.delRole(2);
    }
    @Test
    public void selectR(){
        roleService.selRole(1);
    }
    @Test
    public void updateR(){
        Role role=new Role();role.setId(1);role.setUser_id(4);role.setRole_name("程序员");
        roleService.updRole(role);
    }
    @Test
    public void getPermissionByRoleId(){
        List<Permission> list=new ArrayList<Permission>();
        list=roleService.getPermissionByRoleId(1);
        System.out.println(list);
    }
    @Autowired
    private UserService userService;
    @Test
    public void getRoleByUserName(){
        userService.getRoleByUserName("徐茜");
    }

    @Test
    public void selectByName(){
        userService.selectByName("徐茜");
    }

}
