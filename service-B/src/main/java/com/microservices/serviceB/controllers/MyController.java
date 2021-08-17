package com.microservices.serviceB.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {

    @Value("${spring.cloud.consul.discovery.instanceId}")
    private String insId;



    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/service/b")
    public String hello() {
        return "Reached Service B: "+insId;
    }
}
