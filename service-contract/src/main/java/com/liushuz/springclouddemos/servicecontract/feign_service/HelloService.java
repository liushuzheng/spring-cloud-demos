package com.liushuz.springclouddemos.servicecontract.feign_service;

import com.liushuz.springclouddemos.servicecontract.feign_service.impl.HelloServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author liushuz
 * @date 2019/4/16 14:08
 */
@FeignClient(value = "service-hi", fallback = HelloServiceFallback.class)
public interface HelloService {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "name") String name);
}
