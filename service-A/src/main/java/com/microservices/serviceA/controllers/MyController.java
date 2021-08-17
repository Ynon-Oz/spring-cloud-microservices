package com.microservices.serviceA.controllers;


import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MyController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/service/a")
    @HystrixCommand(fallbackMethod = "fallback")
    public String serviceA(){
        return "Service A calling service B at: "+restTemplate.getForObject("http://service-b/service/b",String.class);
    }

    public String fallback(Throwable e){
        return "Service A: Error -> Service B is not available";
    }
}
