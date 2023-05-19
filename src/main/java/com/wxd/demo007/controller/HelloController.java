package com.wxd.demo007.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangxudong
 * @title: HelloController
 * @projectName demo007
 * @description: TODO
 * @date 2022/10/1214:10
 */
@RestController
@RequestMapping(value = "/hello")
public class HelloController {
    @GetMapping("/getHello")
    public String  getHello() {
        return "hello----------";
    }
}
