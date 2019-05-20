package thegreychain.springframework.springdidemo.controllers;

import org.junit.Before;
import org.junit.Test;
import thegreychain.springframework.springdidemo.controller.PropertyInjectedController;
import thegreychain.springframework.springdidemo.services.GreetingService;
import thegreychain.springframework.springdidemo.services.GreetingServiceImpl;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;
    @Before

    public void setUp() throws Exception {
    this.propertyInjectedController = new PropertyInjectedController();
    this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @Test

    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO,propertyInjectedController.sayHello());
    }
}
