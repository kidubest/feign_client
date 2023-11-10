package com.example.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("account-microservice")
public interface IGreetingClient {

    @RequestMapping("/greeting")
    public String greeting();
}
