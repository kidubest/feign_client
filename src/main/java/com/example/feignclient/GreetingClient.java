package com.example.feignclient;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableFeignClients
@Controller
public class GreetingClient {

    private final IGreetingClient greetingClient;

    public GreetingClient(IGreetingClient greetingClient) {
        this.greetingClient = greetingClient;
    }

    @RequestMapping("/getGreeting")
    public String greeting(Model model) {
        model.addAttribute("greeting", greetingClient.greeting());
        return "greeting_view";
    }
}
