package thegreychain.springframework.springdidemo.controller;

import thegreychain.springframework.springdidemo.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    
    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

}