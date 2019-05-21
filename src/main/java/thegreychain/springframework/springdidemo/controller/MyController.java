package thegreychain.springframework.springdidemo.controller;

import org.springframework.stereotype.Controller;
import thegreychain.springframework.springdidemo.services.GreetingService;

@Controller
public class MyController {
    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!! ");

        return greetingService.sayGreeting();
    }

}
