package com.xq.springbootdemo.controller;

import com.xq.springbootdemo.config.jedis.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import redis.clients.jedis.Jedis;

import java.util.Map;

@RestController()
public class TestController {
    @RequestMapping("/test")
    public Object test(){
        return "hello world";
    }
    //rest风格
    @RequestMapping(value="/test2/{age}",method = RequestMethod.GET)
    public Object test2(@PathVariable int age){
        return age;
    }

    //redis
    @Autowired
    private JedisUtil jedis;
    @RequestMapping("/redis/{val}")
    public Object jedis1(@PathVariable String val){
        jedis.set("key"+val,val);
        return "testValue";
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @RequestMapping("/getJDBC/{id}")
    public Object getJDBC(@PathVariable Integer id){
        String sql="select * from dept where DEPTNO="+id;
        Map<String,Object> data=jdbcTemplate.queryForMap(sql);
        return data;
    }
}
