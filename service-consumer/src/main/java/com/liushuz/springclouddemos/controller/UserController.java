package com.liushuz.springclouddemos.controller;

import com.liushuz.springclouddemos.servicecontract.dto.User;
import com.liushuz.springclouddemos.servicecontract.feign_service.UserContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author liushuz
 * @date 2019/4/15 17:20
 */
@RestController
public class UserController {

    @Autowired
    private UserContract userContract;

    @PostMapping("/user")
    public void add(@RequestBody User user) {
        userContract.add(user);
    }

    @GetMapping("/user/{name}")
    public User findByName(@PathVariable String name) {
        return userContract.findByName(name);
    }

    @GetMapping("/users")
    public List<User> findAll() {
        return userContract.findAll();
    }


}
