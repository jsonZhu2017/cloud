package com.cn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CController {

    @Autowired
    private DiscoveryClient client;

    @GetMapping(value = "/serverName")
    public String serverName(){
        List<String> services = client.getServices();
        for(String service:services){
            System.out.println("service:"+service);
            List<ServiceInstance> serviceInstances = client.getInstances(service);
            for (ServiceInstance serviceInstance:serviceInstances){
                System.out.println(serviceInstance.getHost()+":"+serviceInstance.getPort()+"-"+serviceInstance.getServiceId());
            }
        }

        return "server9002";
    }
}
