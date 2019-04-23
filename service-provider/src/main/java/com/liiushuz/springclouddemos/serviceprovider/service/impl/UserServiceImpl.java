package com.liiushuz.springclouddemos.serviceprovider.service.impl;

import com.liushuz.springclouddemos.servicecontract.dto.User;
import com.liushuz.springclouddemos.servicecontract.feign_service.UserContract;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author liushuz
 * @date 2019/4/15 16:49
 */
@RestController
public class UserServiceImpl implements UserContract {

    private static final Set<User> userSet = new HashSet<>();

    static {
        userSet.add(new User("Alex", 28));
        userSet.add(new User("Lambert", 32));
        userSet.add(new User("Diouf", 30));
    }

    @Override
    public void add(@RequestBody User user) {
        userSet.add(user);
    }

    @Override
    public User findByName(@PathVariable String name) {
        return userSet.stream().filter(user -> user.getName().equals(name)
        ).findFirst().orElse(null);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(userSet);
    }

}
