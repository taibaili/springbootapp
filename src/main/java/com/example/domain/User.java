package com.example.domain;

import lombok.Data;

/**
 * Created by yx198w on 7/9/2017.
 */
@Data
public class User {
    private Long id;
    private String name;
    private Integer age;

    public User() {}

    public User(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
