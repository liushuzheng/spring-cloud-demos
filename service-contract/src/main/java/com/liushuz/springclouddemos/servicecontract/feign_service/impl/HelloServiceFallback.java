package com.liushuz.springclouddemos.servicecontract.feign_service.impl;

import com.liushuz.springclouddemos.servicecontract.feign_service.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author liushuz
 * @date 2019/4/16 14:11
 */
@Service
public class HelloServiceFallback implements HelloService {
    
    @Override
    public String sayHi(String name) {
        return "Fallback method invoked, name is " + name;
    }
}
