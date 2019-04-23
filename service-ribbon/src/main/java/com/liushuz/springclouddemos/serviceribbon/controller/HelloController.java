package com.liushuz.springclouddemos.serviceribbon.controller;

import com.liushuz.springclouddemos.serviceribbon.service.HelloService;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liushuz
 * @date 2019/4/15 15:16
 */
@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping(value = "/hi")
    public String requestForHi(@RequestParam String name) {
        return helloService.requestForHiService(name);
    }

}
