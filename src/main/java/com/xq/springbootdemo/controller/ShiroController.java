package com.xq.springbootdemo.controller;

import com.xq.springbootdemo.domain.User;
import com.xq.springbootdemo.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShiroController {
    @Autowired
    private UserService userService;
    @RequestMapping("/loginShiro/{name}/{password}")
    public Object loginShiro(@PathVariable String name,@PathVariable String password){
        if(name!=null){
            User user=userService.selectByName(name);
            if(user!=null && user.getPassword().equals(password)){
                //添加用户认证信息
                Subject subject= SecurityUtils.getSubject();
                UsernamePasswordToken usernamePasswordToken=new UsernamePasswordToken(name,password);
                //进行验证，这里可以捕获异常，然后返回对应信息
                subject.login(usernamePasswordToken);
                System.out.println("loginShiro:"+usernamePasswordToken);
                return "loginShiro!";
            }
        }
        //调用过logout后通过setLoginUtil重新进入该方法
        return "it's logout!";
    }
    @RequestMapping("/logout")
    public Object logout(){
        return "logout!";
    }
    @RequestMapping("/index")
    public String index(){
        return "index!";
    }
    @RequestMapping("/errorpage")
    public String errorpage(){
        return "error!";
    }
    @RequestMapping("/testShiro")
    public Object testShiro(){
        //业务方法省略...
        return "testShiro:success!";
    }
    //认证角色
    @RequestMapping("/testAuthority")
    @RequiresRoles(value={"admin"})
    public Object testAuthority(){
        return "testAuthority:success!";
    }
    //认证操作权限
    @RequestMapping("/testPermission")
    @RequiresPermissions(value={"creat","update"},logical = Logical.OR)
    public Object testPermission(){
        return "testPermission:success!";
    }

    //自行编写同时两种权限
    @RequestMapping("/testOwnPermission")
    @RequiresRoles(value={"admin"})
    @RequiresPermissions(value={"creat","update"},logical = Logical.OR)
    public  Object testOwnPermission(){
        return "testOwnPermission";
    }
}
