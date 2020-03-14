package com.cn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {


    @GetMapping(value = "/serverName")
    public String serverName(){
        return "server7001";
    }
}
