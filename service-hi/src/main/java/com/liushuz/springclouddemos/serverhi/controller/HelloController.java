package com.liushuz.springclouddemos.serverhi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liushuz
 * @date 2019/4/15 14:07
 */

@RestController
public class HelloController {

    @Value("${server.port}")
    private String port;

    @RequestMapping("/hi")
    public String hi(@RequestParam String name) {
        return "Hi " + name + ", I am from port: " + port;
    }

}
