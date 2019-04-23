package com.liushuz.springclouddemos.servicecontract.dto;

import java.io.Serializable;

/**
 * @author liushuz
 * @date 2019/4/15 16:36
 */

public class User implements Serializable {

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
