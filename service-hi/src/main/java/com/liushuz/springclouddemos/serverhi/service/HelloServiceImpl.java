package com.liushuz.springclouddemos.serverhi.service;

import com.liushuz.springclouddemos.servicecontract.feign_service.HelloService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liushuz
 * @date 2019/4/16 14:11
 */
@RestController
public class HelloServiceImpl implements HelloService {


    @Value("${server.port}")
    private String port;

    @Override
    public String sayHi(String name) {
        return "Hi " + name + ", I am from feign port: " + port;
    }

}
