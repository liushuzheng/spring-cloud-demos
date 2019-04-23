package com.liushuz.springclouddemos.servicecontract.feign_service;

import com.liushuz.springclouddemos.servicecontract.dto.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author liushuz
 * @date 2019/4/15 16:38
 */
@FeignClient("service-provider")
public interface UserContract {

    @PostMapping("/user")
    void add(@RequestBody User user);

    @GetMapping("/user/{name}")
    User findByName(@PathVariable String name);

    @GetMapping("/users")
    List<User> findAll();

}
