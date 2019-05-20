package thegreychain.springframework.springdidemo.controller;

import thegreychain.springframework.springdidemo.services.GreetingServiceImpl;


public class PropertyInjectedController {

    public GreetingServiceImpl greetingService ;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
