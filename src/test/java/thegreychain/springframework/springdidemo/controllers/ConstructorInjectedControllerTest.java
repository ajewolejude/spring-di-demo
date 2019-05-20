package thegreychain.springframework.springdidemo.controllers;

import org.junit.Before;
import org.junit.Test;
import thegreychain.springframework.springdidemo.controller.ConstructorInjectedController;
import thegreychain.springframework.springdidemo.controller.PropertyInjectedController;
import thegreychain.springframework.springdidemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class ConstructorInjectedControllerTest {

    private ConstructorInjectedController constructorInjectedController ;
    @Before

    public void setUp() throws Exception {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test

    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO,constructorInjectedController.sayHello());
    }
}
