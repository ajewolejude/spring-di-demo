package thegreychain.springframework.springdidemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import thegreychain.springframework.springdidemo.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;



    //@Autowired - Auto for constructor based injection

    public ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingService greetingService){
        this.greetingService  = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }

}
