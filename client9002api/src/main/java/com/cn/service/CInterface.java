package com.cn.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(value = "B")
public interface CInterface {

    @RequestMapping(value = "/client8000/serverName",method = RequestMethod.GET)
    String serverName();
}
