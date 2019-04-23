package com.liushuz.springclouddemos.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liushuz
 * @date 2019/4/21 13:38
 */

@RestController
public class ConfigController {

    @Value("${foo}")
    private String foo;

    @RequestMapping(value = "/foo")
    public String foo() {
        return foo;
    }

}
