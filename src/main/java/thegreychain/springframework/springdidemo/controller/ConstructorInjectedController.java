package thegreychain.springframework.springdidemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import thegreychain.springframework.springdidemo.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;



    @Autowired
    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService  = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
