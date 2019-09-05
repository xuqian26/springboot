package com.xq.springbootdemo.domain;

import lombok.Data;

@Data
public class Role {
    private Integer id;
    private Integer user_id;
    private String role_name;

}
