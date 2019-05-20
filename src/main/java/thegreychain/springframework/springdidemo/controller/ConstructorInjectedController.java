package thegreychain.springframework.springdidemo.controller;

import thegreychain.springframework.springdidemo.services.GreetingService;

public class ConstructorInjectedController {

    private GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService  = greetingService;
    }

}
