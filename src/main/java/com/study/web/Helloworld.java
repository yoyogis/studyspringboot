package com.study.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

    @RequestMapping("/hello")
    public String index(){
        return "hello world!!";
    }
}
