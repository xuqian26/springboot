package com.xq.springbootdemo.domain;

import java.util.Date;

public class TestGenerator {
    private Integer id;

    private String name;

    private String sal;

    private Date dateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSal() {
        return sal;
    }

    public void setSal(String sal) {
        this.sal = sal == null ? null : sal.trim();
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}