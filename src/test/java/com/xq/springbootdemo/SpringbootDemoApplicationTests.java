package com.xq.springbootdemo;

import com.xq.springbootdemo.domain.User;
import com.xq.springbootdemo.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.SystemException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemoApplicationTests {
@Autowired
public UserService service;
    @Test
    public void contextLoads() {
        User user=service.selUser(3);
        System.out.println(user.getName());
    }

}
