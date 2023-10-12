package com.battlegao.bookcurd.model;

import lombok.Data;

@Data
//采用注解，默认存在get和set方法
public class Book {

    //数据类型和名称尽量和数据库表中的一致
    private int bno;
    private String bname;
    private String bauth;
}