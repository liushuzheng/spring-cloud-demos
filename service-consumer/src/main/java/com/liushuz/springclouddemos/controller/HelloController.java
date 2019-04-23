package com.liushuz.springclouddemos.controller;


import com.liushuz.springclouddemos.servicecontract.feign_service.HelloService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author liushuz
 * @date 2019/4/16 14:17
 */
@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @GetMapping(value = "/hi")
    String sayHi(@RequestParam(value = "name") String name) {
        return helloService.sayHi(name);
    }

    public static void main(String[] args) {

    }


}
