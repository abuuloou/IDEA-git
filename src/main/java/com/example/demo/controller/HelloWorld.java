package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
    @RequestMapping("info")
    public String hello(){

        return "hello world！ 这是开发人员的一次修改";
        //开发人员
    }
}
