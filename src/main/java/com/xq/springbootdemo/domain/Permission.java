package com.xq.springbootdemo.domain;

import lombok.Data;

@Data
public class Permission {
    private Integer id;
    private Integer role_id;
    private String permission;
}
